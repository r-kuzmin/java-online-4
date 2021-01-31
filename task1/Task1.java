package by.training.cls.task1;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 * 
 * @param args
 */
public class Task1 {

	public static void main(String[] args) {
		Test1 test = new Test1();

		test.setX(78);
		test.setY(15);
		test.print();

		System.out.println("Summ(x, y) = " + test.summ());
		System.out.println("Max(x, y) = " + test.max());
	}

}
