package by.training.cls.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class AirlinesView {

	private Airlines list;

	public Airlines getList() {
		return list;
	}

	public void setList(Airlines list) {
		this.list = list;
	}

	public AirlinesView() {
		this(new Airlines());
	}

	public AirlinesView(Airlines list) {
		super();
		this.list = list;
	}

	/**
	 * Выводит на консоль рейсы по заданному пункту назначения.
	 * 
	 * @param title
	 * @param port
	 */
	public void linesByDestination(String title, Airport port) {

		System.out.println(title + " " + port.getName() + " (" + port.name() + ")");

		for (Airline airline : list) {
			if (airline.getDestination().equals(port)) {
				printLine(airline);
			}
		}
	}

	/**
	 * Выводит на консоль рейсы на указанный день.
	 * 
	 * @param title - заголовок списка.
	 * @param day   - день недели.
	 */
	public void linesByDay(String title, DayOfWeek day) {
		linesByDay(title, day, null);
	}

	/**
	 * Выводит на консоль рейсы на указанный день, время вылета которых больше
	 * заданного.
	 * 
	 * @param title - заголовок списка.
	 * @param day   - день недели.
	 */
	public void linesByDay(String title, DayOfWeek day, LocalTime time) {

		System.out.print(title + " " + day);

		if (time != null) {
			System.out.print(" after " + time);
		} else {
			time = LocalTime.of(0, 0, 0);
		}

		System.out.println();

		for (Airline airline : list) {
			for (DayOfWeek dayOfWeek : airline.getDays()) {
				if (dayOfWeek.equals(day) && airline.getDepartureTime().isAfter(time)) {
					printLine(airline);
					// Рейс выведен. Другие дни проверять не нужно.
					break;
				}
			}
		}
	}

	private void printLine(Airline airline) {

		StringBuilder text = new StringBuilder("\t");
		text.append(airline.getFlightNumber() + "; ");
		text.append(airline.getDestination().getName() + "; ");
		text.append(airline.getDepartureTime() + "; ");

		AircraftType type = airline.getAircraftType();
		text.append(type.getBrand().getName() + " " + type.getModel());
		System.out.println(text);
	}

}
