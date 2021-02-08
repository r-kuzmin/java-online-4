package by.epam.training.cls.task9;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц,
 * цена, тип переплета.
 * 
 * Найти и вывести: a) список книг заданного автора; b) список книг, выпущенных
 * заданным издательством; c) список книг, выпущенных после заданного года.
 * 
 * @author R. Kuzmin
 *
 */
public class Task9 {

	public static void main(String[] args) {

		Books list = loadData();
		BooksView view = new BooksView(list);

		Person author = new Person("Млодинов", "Леонард");
		view.booksByAuthor("Книги по автору", author);

		view.booksByPublisher("Книги по издательству", "АСТ");

		view.booksAfterYear("Книги, изданные после 2020 года", 2020);
	}

	private static Books loadData() {

		Books list = new Books();

		Person[] authors1 = new Person[] { new Person("Млодинов", "Леонард") };
		list.add("(Не) совершенная случайность.", authors1, "Livebook", 2017, 352, 13.14, BindingType.HARD);

		Person[] authors2 = new Person[] { new Person("Абгарян", "Наринэ"), new Person("Цыпкин", "Александр") };
		list.add("Беспринцыпные чтения", authors2, "АСТ", 2019, 252, 10, BindingType.HARD);

		Person[] authors3 = new Person[] { new Person("Conan Doyle", "Arthur"), new Person("Ерёмин", "Андрей") };
		list.add("Английский с Шерлоком Холмсом", authors3, "ВКН", 2020, 416, 25.3, BindingType.SOFT);

		return list;
	}

}
