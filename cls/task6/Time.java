package by.epam.training.cls.task6;

public class Time {

	private int value;

	private static final int MINUTE = 60;
	private static final int HOUR = 3600;

	/**
	 * Создание нового объекта (00:00:00).
	 */
	public Time() {
		this(0, 0, 0);
	}

	/**
	 * Создание нового объекта с указанными значениями часов, минут, секунд.
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	/**
	 * Устанавливает в текущем объекте указанное количество часов, минут, секунд.
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public void setTime(int hour, int minute, int second) {
		if (hour > 23 || hour < 0) {
			hour = 0;
		}

		if (minute > 59 || minute < 0) {
			minute = 0;
		}

		if (second > 59 || second < 0) {
			second = 0;
		}

		this.value = hour * Time.HOUR + minute * Time.MINUTE + second;
	}

	/**
	 * Возвращает количество часов.
	 * 
	 * @return
	 */
	public int getHour() {
		return value / Time.HOUR;
	}

	/**
	 * Устанавливает для текущего объекта указанное количество часов.
	 * 
	 * @param hour
	 */
	public void setHour(int hour) {
		setTime(hour, getMinute(), getSecond());
	}

	/**
	 * Возвращает количество минут.
	 * 
	 * @return
	 */
	public int getMinute() {
		return (value - getHour() * Time.HOUR) / Time.MINUTE;
	}

	/**
	 * Устанавливает для текущего объекта указанное количество минут.
	 * 
	 * @param minute
	 */
	public void setMinute(int minute) {
		setTime(getHour(), minute, getSecond());
	}

	/**
	 * Возвращает количество секунд.
	 * 
	 * @return
	 */
	public int getSecond() {
		return value - getHour() * Time.HOUR - getMinute() * Time.MINUTE;
	}

	/**
	 * Устанавливает для текущего объекта указанное количество секунд.
	 * 
	 * @param second
	 */
	public void setSecond(int second) {
		setTime(getHour(), getMinute(), second);
	}

	@Override
	public String toString() {
		return getHour() + ":" + getMinute() + ":" + getSecond();
	}

	/**
	 * Добавляет (для отрицательных значений - вычитает) из текущего времени
	 * указанное количество часов, минут, секунд.
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public void add(int hour, int minute, int second) {
		addHours(hour);
		addMinutes(minute);
		addSeconds(second);
	}

	public void addHours(int hour) {
		this.value += hour * Time.HOUR;
	}

	public void addMinutes(int minute) {
		this.value += minute * Time.MINUTE;
	}

	public void addSeconds(int second) {
		this.value += second;
	}
	
}
