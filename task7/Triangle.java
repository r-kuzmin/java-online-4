package by.training.cls.task7;

/**
 * Класс, описывающий треугольники. Фигуры создаются по координатам 3 вершин,
 * указанными как объекты класса Point.
 * 
 * @author R. Kuzmin
 *
 */
public class Triangle {

	private Point a, b, c;

	/**
	 * Неинициализированный треугольник нулевых размеров.
	 */
	public Triangle() {
		this(new Point(), new Point(), new Point());
	}

	/**
	 * Треугольник с вершинами в указанных точках.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(Point a, Point b, Point c) {
		setVertices(a, b, c);
	}

	/**
	 * Треугольник с вершинами в указанных точках. Вершины задаются как массив из 3
	 * элементов, каждый элемент которого - массив из 2 координат типа double.
	 * 
	 * @param array
	 */
	public Triangle(double[][] array) {

		Point[] points = new Point[array.length];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].length == 2) {
				points[i] = new Point(array[i][0], array[i][1]);
			}
		}

		setVertices(points);
	}

	/**
	 * Устанавливает для текущего треугольника координаты вершин. Вершинами будут
	 * установлены первые 3 параметра. Если параметров меньше 3, изменятся только
	 * первые, а остальные остануться не измененными.
	 */
	public void setVertices(Point... points) {

		for (int i = 0; i < 3 && i < points.length; i++) {
			if (points[i] != null && points[i] instanceof Point) {
				if (i == 0) {
					this.a = points[i];
				} else if (i == 1) {
					this.b = points[i];
				} else if (i == 2) {
					this.c = points[i];
				}
			}
		}

	}

	@Override
	public String toString() {
		return "Triangle [" + a.toString() + ", " + b.toString() + ", " + c.toString() + "]";
	}

	/**
	 * Площадь треугольника. Можно обобщить для любого многоугольника:
	 * https://en.wikipedia.org/wiki/Shoelace_formula
	 * 
	 * @return
	 */
	public double square() {

		double part1 = a.x() * b.y() + b.x() * c.y() + c.x() * a.y();
		double part2 = a.y() * b.x() + b.y() * c.x() + c.y() * a.x();

		return Math.abs(part1 - part2) / 2;
	}

	/**
	 * Периметр треугольника.
	 * 
	 * @return
	 */
	public double perimeter() {

		double ab = Point.distance(a, b);
		double bc = Point.distance(b, c);
		double ca = Point.distance(c, a);

		return ab + bc + ca;
	}

	/**
	 * Точка пересечения медиан (барицентр).
	 * 
	 * @return
	 */
	public Point barycenter() {

		double x = (a.x() + b.x() + c.x()) / 3;
		double y = (a.y() + b.y() + c.y()) / 3;

		return new Point(x, y);
	}

}
