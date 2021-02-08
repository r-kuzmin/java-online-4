package by.epam.training.cls.task2;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 * 
 * @author R. Kuzmin
 *
 */
public class Task2 {

	public static void main(String[] args) {
		Test2 test = new Test2(3, 5);
		System.out.println("x = " + test.getX());
		System.out.println("y = " + test.getY());
	}

}
