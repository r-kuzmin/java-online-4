package by.epam.training.agregation.task2;

public class Wheel {

	private String model;
	private int width;
	private int profileHeight;
	private int diameter;
	private int treadHeight;

	public Wheel() {
		this("", 0, 0, 0, 0);
	}

	public Wheel(String model, int width, int profileHeight, int diameter, int treadHeight) {
		super();
		this.model = model;
		this.width = width;
		this.profileHeight = profileHeight;
		this.diameter = diameter;
		this.treadHeight = treadHeight;
	}

	public String getModel() {
		return model;
	}

	public int getWidth() {
		return width;
	}

	public int getProfileHeight() {
		return profileHeight;
	}

	public int getDiameter() {
		return diameter;
	}

	public int getTreadHeight() {
		return treadHeight;
	}

	@Override
	public String toString() {
		return "Wheel [model=" + model + ", width=" + width + ", profileHeight=" + profileHeight + ", diameter="
				+ diameter + ", treadHeight=" + treadHeight + "]";
	}

	public String getDescription() {
		return model + " " + width + "/" + profileHeight + " R" + diameter;
	}

}
