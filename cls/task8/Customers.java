package by.training.cls.task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Список клиентов.
 * 
 * @author R. Kuzmin
 *
 */
public class Customers extends ArrayList<Customer> {

	/**
	 * Версия класса для сериализации/десериализации объектов. Требуется, поскольку
	 * ArrayList implements Serializable.
	 */
	private static final long serialVersionUID = -7661138045280831400L;

	/**
	 * Проверяет, что переданное значение не используется в качестве кода в данном
	 * списке.
	 * 
	 * @param id
	 * @return
	 */
	public boolean isUniqueId(int id) {
		
		for (Customer customer : this) {
			if (customer.getId() == id) {
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
	 * Упрощённый вариант создания и добавления в список пользователя по значениям
	 * полей.
	 * 
	 * @param surname
	 * @param name
	 * @param patronymic
	 * @param address
	 * @param creditCard
	 * @param accountNumber
	 * @return
	 */
	public boolean add(String surname, String name, String patronymic, String address, String creditCard,
			String accountNumber) {

		int id = this.getNextId();
		BigInteger card = new BigInteger(creditCard);

		Customer customer = new Customer(id, surname, name, patronymic, address, card, accountNumber);

		return this.add(customer);
	}

	public void sortById() {
		// Естественная сортировка, использующая метод compareTo класса Customer.
		this.sort(null);
	}

	public void sortBySurname() {

		// Сортировка по полю Surname с использованием Comparator.
		Comparator<Customer> cmp = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			}
		};

		Collections.sort(this, cmp);
	}

	public void sortByAddress() {

		// Аналог sortBySurname для поля Address с использованием лямбда-выражений.
		Collections.sort(this, (o1, o2) -> o1.getAddress().compareTo(o2.getAddress()));
	}

}
