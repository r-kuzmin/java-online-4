package by.epam.training.cls.task9;

import java.util.ArrayList;

public class Books extends ArrayList<Book> {

	/**
	 * Версия класса для сериализации/десериализации объектов. Требуется, поскольку
	 * ArrayList implements Serializable.
	 */
	private static final long serialVersionUID = -2387806791206639776L;

	/**
	 * Проверяет уникальность id в данном списке.
	 * 
	 * @param id
	 * @return
	 */
	public boolean isUniqueId(int id) {

		for (Book bk : this) {
			if (bk.getId() == id) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Генерирует новый уникальный id.
	 * 
	 * @return
	 */
	public int getNextId() {

		int id;

		do {
			id = (int) (Math.random() * 100_000);
		} while (!this.isUniqueId(id));

		return id;
	}

	/**
	 * Добавляет новую книгу в список с заполнением полей.
	 * 
	 * @param name
	 * @param autors
	 * @param publisher
	 * @param year
	 * @param pages
	 * @param price
	 * @param binding
	 * @return
	 */
	public boolean add(String name, Person[] autors, String publisher, int year, int pages, double price,
			BindingType binding) {

		int id = getNextId();

		Book bk = new Book(id, name, autors, publisher, year, pages, price, binding);

		return this.add(bk);
	}

}
