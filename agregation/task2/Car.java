package by.epam.training.agregation.task2;

public class Car {

	private String model;
	private Engine engine;
	private CarState state;
	private String textState;
	private int fuel;

	private Wheel leftFrontWheel;
	private Wheel rightFrontWheel;
	private Wheel leftRearWheel;
	private Wheel rightRearWheel;
	private Wheel spareWheel;

	public class Engine {

		private String model;
		private int power;

		public Engine() {
			this("", 0);
		}

		public Engine(String model, int power) {
			super();
			this.model = model;
			this.power = power;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}

		@Override
		public String toString() {
			return "Engine [model=" + model + ", power=" + power + "]";
		}

		public String getDescription() {
			return model + " " + power + "hp";
		}

	}

	public Car(String model) {
		this(model, null, null, null, null, null, null);
	}

	public Car(String model, Wheel leftFrontWheel, Wheel rightFrontWheel, Wheel leftRearWheel, Wheel rightRearWheel,
			Wheel spareWheel, Engine engine) {
		super();
		this.model = model;
		this.leftFrontWheel = leftFrontWheel;
		this.rightFrontWheel = rightFrontWheel;
		this.leftRearWheel = leftRearWheel;
		this.rightRearWheel = rightRearWheel;
		this.spareWheel = spareWheel;
		this.engine = engine;
		this.state = CarState.STAND;
		this.textState = "";
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getTextState() {
		return textState;
	}

	public Wheel getWheel(WheelPosition position) {

		switch (position) {
		case LEFT_FRONT:
			return leftFrontWheel;

		case RIGHT_FRONT:
			return rightFrontWheel;

		case LEFT_REAR:
			return leftRearWheel;

		case RIGHT_REAR:
			return rightRearWheel;

		case SPARE:
			return spareWheel;

		default:
			return null;
		}
	}

	/**
	 * Устанавливает колесо на машину. Возвращает то колесо, которое было заменено.
	 * Если позиция для замены не указана, меняется запасное колесо. Если замена
	 * невозможна, возвращает null.
	 * 
	 * @param wheel    - новое колесо.
	 * @param position - место установки.
	 * @return - старое колесо.
	 */
	public Wheel setWheel(Wheel wheel, WheelPosition position) {

		if (state.equals(CarState.MOVE)) {
			textState = "Impossible to change a wheel on the go.";
			return null;
		}

		if (position == null) {
			position = WheelPosition.SPARE;
		}

		Wheel result;

		switch (position) {
		case LEFT_FRONT:
			result = leftFrontWheel;
			leftFrontWheel = wheel;
			break;

		case RIGHT_FRONT:
			result = rightFrontWheel;
			rightFrontWheel = wheel;
			break;

		case LEFT_REAR:
			result = leftRearWheel;
			leftRearWheel = wheel;
			break;

		case RIGHT_REAR:
			result = rightRearWheel;
			rightRearWheel = wheel;
			break;

		default:
			result = spareWheel;
			spareWheel = wheel;
		}

		return result;
	}

	/**
	 * Меняет колёса местами.
	 * 
	 * @param pos1
	 * @param pos2
	 * @return
	 */
	public boolean changeWheels(WheelPosition pos1, WheelPosition pos2) {

		if (state.equals(CarState.MOVE)) {
			textState = "Impossible to change a wheel on the go.";
			return false;
		}

		Wheel w1 = getWheel(pos1);
		Wheel w2 = getWheel(pos2);

		setWheel(w2, pos1);
		setWheel(w1, pos2);

		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", state=" + state + ", textState=" + textState
				+ ", fuel=" + fuel + ", leftFrontWheel=" + leftFrontWheel + ", rightFrontWheel=" + rightFrontWheel
				+ ", leftRearWheel=" + leftRearWheel + ", rightRearWheel=" + rightRearWheel + ", spareWheel="
				+ spareWheel + "]";
	}

	public CarState getState() {
		return state;
	}

	public void go() {

		if (engine == null) {
			textState = "Missing engine.";

		} else if (leftFrontWheel == null) {
			textState = "Missing left front wheel.";

		} else if (rightFrontWheel == null) {
			textState = "Missing right front wheel.";

		} else if (leftRearWheel == null) {
			textState = "Missing left rear wheel.";

		} else if (rightRearWheel == null) {
			textState = "Missing right rear wheel.";

		} else if (fuel <= 0) {
			textState = "Missing fuel.";

		} else {
			textState = "Here goes!";
			state = CarState.MOVE;
			fuel--;
		}
	}

	public void brake() {
		textState = "Has stopped.";
		state = CarState.STAND;
	}

	public void refueling(int volume) {
		fuel += volume;
	}
}
