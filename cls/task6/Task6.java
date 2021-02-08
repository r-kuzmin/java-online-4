package by.epam.training.cls.task6;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда) с
 * проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 * 
 * @author R. Kuzmin
 *
 */
public class Task6 {

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println("Пустой объект " + time.toString());

		Time myTime = new Time(18, 23, 40);
		System.out.println("Инициализированный объект: " + myTime.toString());
		
		myTime.setHour(-26);
		System.out.println("Ошибка при установке -26 часов: " + myTime.toString());
		
		myTime.add(1, 1, 1);
		System.out.println("Добавили 1 час, 1 минуту, 1 секунду: " + myTime.toString());
		
		myTime.addMinutes(-90);
		System.out.println("Вычли 90 минут: " + myTime.toString());
	}

}
