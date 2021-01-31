package by.training.cls.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни
 * недели.
 * 
 * Найти и вывести: a) список рейсов для заданного пункта назначения; b) список
 * рейсов для заданного дня недели; c) список рейсов для заданного дня недели,
 * время вылета для которых больше заданного.
 * 
 * @author R. Kuzmin
 *
 */
public class Task10 {

	public static void main(String[] args) {
		
		Airlines lines = loadData();
		AirlinesView view = new AirlinesView(lines);
		
		view.linesByDestination("Flights on destination", Airport.LED);
		
		view.linesByDay("Flights on", DayOfWeek.WEDNESDAY);
		view.linesByDay("Flights on", DayOfWeek.FRIDAY, LocalTime.of(7, 30));
		
	}

	private static Airlines loadData() {
		
		Airlines lines = new Airlines();
		
		lines.add("DME", "B2 827", "Embraer", "E175", 23, 55, new String[] {"WEDNESDAY", "SUNDAY"});
		lines.add("SVO", "B2 755", "Boeing", "737-800", 2, 30, new String[] {"TUESDAY", "FRIDAY"});
		lines.add("VKO", "B2 819", "Embraer", "E175", 8, 30, new String[] {"FRIDAY", "SATURDAY"});
		lines.add("LED", "B2 896", "Boeing", "737-300", 18, 10, new String[] {"MONDAY"});
		lines.add("MSQ", "B2 894", "Airbus", "A320", 19, 5, new String[] {"WEDNESDAY", "THURSDAY", "SUNDAY"});
		
		return lines;
	}
}
