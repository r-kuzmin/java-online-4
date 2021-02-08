package by.epam.training.agregation.task1;

import java.util.ArrayList;

public class Sentence extends ArrayList<Word> {

	private static final long serialVersionUID = -2374822774878912571L;

	public Sentence() {
		this("");
	}

	public Sentence(String text) {
		super();

		String[] words = text.split("\\s");

		for (String string : words) {
			this.add(new Word(string));
		}
	}

	public String getText() {
		StringBuilder sb = new StringBuilder();

		for (Word word : this) {
			sb.append(word.getText());
			sb.append(" ");
		}

		return sb.toString();
	}
}
