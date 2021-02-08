package by.epam.training.cls.task5;

/**
 * Десятичный счётчик. Позволяет задать диапазон допустимых значений [min; max).
 * Нижняя граница включается в диапазон, верхняя - нет.
 * Для увеличения счетчика используйте tik(), для уменьшения - tok().
 * 
 * @author R. Kuzmin
 *
 */
public class DecimalCounter {

	private byte units;
	private int value;
	private int min;
	private int max;

	/**
	 * Создаёт десятичный счетчик со значениями по умолчанию.
	 */
	public DecimalCounter() {
		this(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
	}

	/**
	 * Создаёт десятичный счетчик с заданными минимальным и максимальным значениями.
	 * 
	 * @param min - минимальное значение счетчика.
	 * @param max - максимальное значение счетчика.
	 */
	public DecimalCounter(int min, int max) {
		this(min, max, 0);
	}

	/**
	 * Создаёт десятичный счетчик с заданными минимальным и максимальным значениями
	 * и произвольным начальным значением счетчика. Если начальное значение выходит
	 * за границы допустимого диапазона, оно будет установлено на ближайшую границу.
	 * 
	 * @param min  - минимальное значение счетчика.
	 * @param max  - максимальное значение счетчика.
	 * @param value - начальное значение.
	 */
	public DecimalCounter(int min, int max, int value) {
				
		if (min > max) {
			throw new IllegalArgumentException("Минимальное значение счетчика больше максимального");
		}

		units = 0;
		this.min = min;
		this.max = max;

		if (value > max) {
			this.value = max;
		} else if (value < min) {
			this.value = min;
		} else {
			this.value = value;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "DecimalCounter [units=" + units + ", value=" + value + ", min=" + min + ", max=" + max + "]";
	}

	/**
	 * Отсчет счетчика в сторону увеличения. Счетчик циклический: если счетчик
	 * достиг максимума, ему будет присвоено минимальное значение.
	 */
	public void tik() {
		units++;

		if (units == 10) {
			units = 0;

			value++;
			if (value == max) {
				value = min;
			}
		}
	}

	/**
	 * Отсчет счетчика в сторону уменьшения. Счетчик циклический: если счетчик
	 * достиг минимума, при очередном отсчёте ему будет присвоено максимальное
	 * значение.
	 */
	public void tok() {
		units--;

		if (units == -10) {
			units = 0;

			if (value == min) {
				value = max;
			} else {
				value--;
			}
		}
	}

}