package by.training.agregation.task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы:
 * дополнить текст, вывести на консоль текст, заголовок текста.
 * 
 * @author R. Kuzmin
 *
 */
public class Task1 {

	public static void main(String[] args) {
		
		Text text = new Text("Заботливый цветок");
		
		text.add("Есть такое растение с красными цветами.");
		text.add("Цветы эти собраны в большие стоячие кисти.");
		text.add("Называется оно кипрей.");
		
		View.printText(text);
	}

}
