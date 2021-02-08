package by.epam.training.agregation.task2;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 * 
 * @author R. Kuzmin
 *
 */
public class Task2 {

	public static void main(String[] args) {
		
		// Можно выделить отдельно производителя и модель.
		Car car = new Car("Kia Rio x-line");
		System.out.println(car.getModel());
		
		car.go();
		System.out.println("Поехали (1): " + car.getTextState());
		
		car.setEngine(car.new Engine("Gamma G4FG", 123));
		car.go();
		System.out.println("Поехали (2): " + car.getTextState());
		
		// Покупаем новые колёса.
		Wheel w1 = new Wheel("Nexen", 185, 65, 15, 8);
		Wheel w2 = new Wheel("Nexen", 185, 65, 15, 8);
		
		// Ещё пара б/у с износом 1 мм
		Wheel w3 = new Wheel("Nexen", 185, 65, 15, 7);
		Wheel w4 = new Wheel("Nexen", 185, 65, 15, 7);
		
		// Устанавливаем колёса.
		car.setWheel(w1, WheelPosition.LEFT_FRONT);
		car.setWheel(w2, WheelPosition.LEFT_REAR);
		car.setWheel(w3, WheelPosition.RIGHT_FRONT);
		car.setWheel(w4, WheelPosition.RIGHT_REAR);
		
		car.go();
		System.out.println("Поехали (3): " + car.getTextState());
		
		car.refueling(20);
		car.go();
		System.out.println("Поехали (4): " + car.getTextState());
		
		car.changeWheels(WheelPosition.LEFT_FRONT, WheelPosition.SPARE);
		System.out.println("Замена колеса на ходу: " + car.getTextState());
		
		car.brake();
		car.refueling(10);
		System.out.println("Остановка: " + car.getTextState());
		
		car.changeWheels(WheelPosition.LEFT_FRONT, WheelPosition.SPARE);
		car.go();
		System.out.println("Снимаем колесо, кладём в багажник: " + car.getTextState());
		
		car.changeWheels(WheelPosition.SPARE, WheelPosition.LEFT_FRONT);
		car.go();
		System.out.println("Ставим колесо из багажника: " + car.getTextState());
	}

}
