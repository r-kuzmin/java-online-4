package by.training.cls.task7;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 * 
 * @author R. Kuzmin
 *
 */
public class Task7 {

	public static void main(String[] args) {

		Triangle tr = new Triangle(new double[][] { { 0, 0 }, { -5, 5 }, { 5, 5 } });

		System.out.println(tr.toString());
		System.out.println("Площадь = " + tr.square());
		System.out.println("Периметр = " + tr.perimeter());
		System.out.println("Точка пересечения медиан: " + tr.barycenter().toString());
	}

}
