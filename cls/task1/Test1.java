package by.epam.training.cls.task1;

public class Test1 {

	private int x;
	private int y;

	/**
	 * Метод вывода на экран не должен содержаться в классе, но задание
	 * сформулировано именно так.
	 */
	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int summ() {
		return x + y;
	}

	public int max() {
		return (x > y) ? x : y;
	}
}
