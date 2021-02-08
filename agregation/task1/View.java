package by.epam.training.agregation.task1;

public class View {

	public static void printText(Text text) {

		System.out.println(text.getTitle());

		for (Sentence sentence : text) {
			System.out.print(sentence.getText());
		}
	}

}
