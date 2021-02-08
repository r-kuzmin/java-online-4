package by.epam.training.cls.task4;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * 
 * Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем.
 * 
 * Добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
 * времени отправления.
 * 
 * @author R. Kuzmin
 *
 */
public class Task4 {

	public static void main(String[] args) {
		
		Train[] trains = loadTrains();

		System.out.println("Поезда, отсортированные по номеру:");
		sortByNumber(trains);
		
		for (Train train : trains) {
			System.out.println(train);
		}

		System.out.println("\nПоезда, отсортированные по пункту назначения:");
		sortByDestination(trains);

		for (Train train : trains) {
			System.out.println(train);
		}

		findByNumber(trains);
	}

	private static Train[] loadTrains() {

		Train[] trains = new Train[5];

		trains[0] = new Train("Maidstone, Kent", "801");
		trains[0].setDepartureTime(2020, 01, 19, 18, 0);

		trains[1] = new Train("Truro, Cornwall", "502");
		trains[1].setDepartureTime(2020, 01, 19, 19, 25);

		trains[2] = new Train("Chichester, West Sussex", "371");
		trains[2].setDepartureTime(2020, 01, 19, 20, 0);

		trains[3] = new Train("Guildford, Surrey", "125");
		trains[3].setDepartureTime(2020, 01, 20, 1, 7);

		trains[4] = new Train("Guildford, Surrey", "125");
		trains[4].setDepartureTime(2020, 01, 19, 1, 7);

		return trains;
	}

	/**
	 * Сортирует переданный массив рейсов по номеру.
	 * 
	 * @param array - исходный массив.
	 * @return
	 */
	private static void sortByNumber(Train[] array) {

		if (array == null || array.length == 0) {
			return;
		}

		Train tmp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				String num1 = array[j].getNumber();
				String num2 = array[j + 1].getNumber();
				int cmpNumber = num1.compareTo(num2);

				if (cmpNumber > 0) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;

				} else if (cmpNumber == 0) {
					GregorianCalendar time1 = array[j].getDepartureTime();
					GregorianCalendar time2 = array[j + 1].getDepartureTime();
					int cmpTime = time1.compareTo(time2);

					if (cmpTime > 0) {
						tmp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = tmp;
					}
				}
			}
		}
	}

	/**
	 * Сортирует переданный массив рейсов по пункту назначения.
	 * 
	 * @param array - исходный массив.
	 * @return
	 */
	private static void sortByDestination(Train[] array) {

		if (array == null || array.length == 0) {
			return;
		}

		Train tmp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				String num1 = array[j].getDestination();
				String num2 = array[j + 1].getDestination();
				int cmpNumber = num1.compareTo(num2);

				if (cmpNumber > 0) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;

				} else if (cmpNumber == 0) {
					GregorianCalendar time1 = array[j].getDepartureTime();
					GregorianCalendar time2 = array[j + 1].getDepartureTime();
					int cmpTime = time1.compareTo(time2);

					if (cmpTime > 0) {
						tmp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = tmp;
					}
				}
			}
		}
	}

	/**
	 * Выводит информацию о поезде, номер которого пользователь вводит с консоли.
	 * 
	 * @param array - массив рейсов, в котором ищем нужный номер.
	 */
	private static void findByNumber(Train[] array) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter train number >>");

		while (!sc.hasNext()) {
			sc.next();
			System.out.print("Enter train number >>");
		}

		String num = sc.next();

		for (Train train : array) {
			if (train.getNumber().equalsIgnoreCase(num)) {
				System.out.println(train);
			}
		}
	}

}
