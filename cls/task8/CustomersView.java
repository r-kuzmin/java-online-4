package by.training.cls.task8;

import java.math.BigInteger;

/**
 * Консольное представление списка клиентов.
 * 
 * @author R. Kuzmin
 *
 */
public class CustomersView {

	private Customers list;
	
	public Customers getList() {
		return list;
	}

	public void setList(Customers list) {
		this.list = list;
	}

	public CustomersView() {
		this(new Customers());
	}

	public CustomersView(Customers list) {
		super();
		this.list = list;
	}

	/**
	 * Вывод в консоль списка клиентов.
	 * 
	 * @param title
	 */
	public void printList(String title) {

		System.out.println(title);

		for (Customer customer : list) {
			System.out.println("\t" + customerToString(customer));
		}
	}

	/**
	 * Список клиентов, отфильтрованный по номерам кредитных карт.
	 * 
	 * @param title
	 * @param begin
	 * @param end
	 */
	public void filterByCard(String title, BigInteger begin, BigInteger end) {

		System.out.println(title);

		for (Customer customer : list) {

			BigInteger card = customer.getCreditCard();

			if (card.compareTo(begin) >= 0 && card.compareTo(end) <= 0) {
				System.out.println("\t" + customerToString(customer));
			}
		}
	}

	private String customerToString(Customer customer) {

		StringBuilder str = new StringBuilder("[");

		str.append(customer.getId() + "; ");
		str.append(customer.getSurname() + " " + customer.getName() + " " + customer.getPatronymic() + "; ");
		str.append(customer.getAddress() + "; ");
		str.append("Card: " + customer.getCreditCard());

		return str.append("]").toString();
	}

}
