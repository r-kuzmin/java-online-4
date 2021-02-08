package by.epam.training.cls.task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 * 
 * @author R. Kuzmin
 *
 */
public class Task3 {

	public static void main(String[] args) {

		Student[] students = loadStudents();

		System.out.println("Отличники:");
		for (Student student : students) {
			if (student.excellent(9)) {
				System.out.println("Фамилия: " + student.getSurname() + ", группа: " + student.getGroup());
			}
		}
		
	}

	private static Student[] loadStudents() {

		Student[] students = new Student[10];

		students[0] = new Student("Шиндлер О.", "JW-39");
		students[0].setGrades(new int[] { 9, 10, 10, 10, 9 });

		students[1] = new Student("Штерн И.", "JW-39");
		students[1].setGrades(new int[] { 9, 9, 9, 10, 9 });

		students[2] = new Student("Гёт А.", "DN-41");
		students[2].setGrades(new int[] { 5, 6, 3, 7, 10 });

		students[3] = new Student("Шиндлер Э.", "JW-39");
		students[3].setGrades(new int[] { 7, 9, 9, 7, 9 });

		students[4] = new Student("Пфефферберг П.", "JW-39");
		students[4].setGrades(new int[] { 6, 6, 6, 10, 9 });

		students[5] = new Student("Хирш Х.", "DN-39");
		students[5].setGrades(new int[] { 9, 9, 9, 9, 9 });

		students[6] = new Student("Голдберг М.", "JW-39");
		students[6].setGrades(new int[] { 7, 7, 8, 6, 9 });

		students[7] = new Student("Левартов М.", "JW-39");
		students[7].setGrades(new int[] { 9, 9, 4, 6, 7 });

		students[8] = new Student("Шернер Ю.", "JW-39");
		students[8].setGrades(new int[] { 5, 6, 7, 8, 9 });

		students[9] = new Student("Хоровиц Д.", "JW-39");
		students[9].setGrades(new int[] { 5, 6, 7, 8, 9 });

		return students;
	}

}