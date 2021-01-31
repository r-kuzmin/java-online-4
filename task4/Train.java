package by.training.cls.task4;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Train {

	private String destination;
	private String number;
	private GregorianCalendar departureTime;

	public Train(String destination, String number) {
		this.destination = destination;
		this.number = number;
	}

	public void setDepartureTime(int year, int month, int day, int hour, int minutes) {
		GregorianCalendar time = new GregorianCalendar();
		time.set(year, month, day, hour, minutes);
		this.departureTime = time;
	}

	@Override
	public String toString() {

		SimpleDateFormat fmt = new SimpleDateFormat("dd MMM yyyy, HH:mm");
		String dateFormatted = fmt.format(departureTime.getTime());

		return "Train [destination = " + destination + ", number = " + number + ", departureTime = " + dateFormatted + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public GregorianCalendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(GregorianCalendar departureTime) {
		this.departureTime = departureTime;
	}
	
}
