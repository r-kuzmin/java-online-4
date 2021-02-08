package by.epam.training.cls.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

public class Airlines extends ArrayList<Airline> {

	/**
	 * Версия класса для сериализации/десериализации объектов. Требуется, поскольку
	 * ArrayList implements Serializable.
	 */
	private static final long serialVersionUID = -1254506780788283796L;

	/**
	 * Добавление нового рейса в список с заполнением полей.
	 * 
	 * @param destination
	 * @param flightNumber
	 * @param aircraftType
	 * @param hour
	 * @param minutes
	 * @param days
	 * @return
	 */
	public boolean add(String destination, String number, String brand, String model, int hour, int minutes,
			String[] days) {

		Airport port = Airport.valueOf(destination.trim().toUpperCase());

		AircraftBrand aircraftBrand = AircraftBrand.valueOf(brand.trim().toUpperCase());
		AircraftType type = new AircraftType(aircraftBrand, model);

		LocalTime time = LocalTime.of(hour, minutes);

		DayOfWeek[] daysOfWeek = new DayOfWeek[days.length];
		for (int i = 0; i < days.length; i++) {
			daysOfWeek[i] = DayOfWeek.valueOf(days[i].trim().toUpperCase());
		}

		Airline line = new Airline(port, number, type, time, daysOfWeek);

		return this.add(line);
	}

}
