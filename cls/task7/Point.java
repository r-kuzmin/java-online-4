package by.epam.training.cls.task7;

/**
 * Класс, описывающий точки на плоскости.
 * 
 * @author R. Kuzmin
 *
 */
public class Point {

	private double x, y;

	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double getX() {
		return x;
	}

	/**
	 * Сокращённая версия метода getX.
	 * 
	 * @return
	 */
	public double x() {
		return getX();
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	/**
	 * Сокращённая версия метода getY.
	 * 
	 * @return
	 */
	public double y() {
		return getY();
	}

	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Расстояние между двумя точками.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double distance(Point a, Point b) {

		double vectorX = Math.pow((b.x() - a.x()), 2);
		double vectorY = Math.pow((b.y() - a.y()), 2);

		return Math.sqrt(vectorX + vectorY);
	}
}
