package by.training.cls.task8;

import java.math.BigInteger;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 * номер банковского счета.
 * 
 * Найти и вывести: a) список покупателей в алфавитном порядке; b) список
 * покупателей, у которых номер кредитной карточки находится в заданном
 * интервале.
 * 
 * @author R. Kuzmin
 *
 */
public class Task8 {

	public static void main(String[] args) {

		Customers customers = loadData();
		CustomersView view = new CustomersView(customers);
		
		customers.sortBySurname();
		view.printList("Клиенты, отсортированые по фамилии:");

		BigInteger begin = new BigInteger("4377725821970000");
		BigInteger end = new BigInteger("4377725821980000");
		view.filterByCard("Фильтр по карточкам:", begin, end);
	}

	private static Customers loadData() {

		Customers list = new Customers();

		list.add("Сидоров", "Николай", "Фомич", "Брест, Декабристов 5 - 50", "5277725821977878",
				"BY39ALFA30156678123420290000");
		
		list.add("Иванов", "Иван", "Иванович", "Минск, Сурганова, 13 - 50", "4377725821970374",
				"BY39ALFA30156678123420270000");
		
		list.add("Петров", "Степан", "Сергеевич", "Витебск, Первомайская 20 - 6", "4377725821978256",
				"BY39ALFA30156678123420280000");

		return list;
	}
}
