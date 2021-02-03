package by.training.agregation.task1;

import java.util.ArrayList;

public class Text extends ArrayList<Sentence> {

	private static final long serialVersionUID = 6448162261580688607L;

	private String title;

	public Text() {
		this("");
	}

	public Text(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Text [");

		sb.append("\n\t title=" + title);
		sb.append("\n\t sentences=[");

		for (Sentence sentence : this) {
			sb.append("\n\t\t" + sentence.toString());
		}

		sb.append("\n\t]");
		sb.append("\n]");

		return sb.toString();
	}

	/**
	 * Добавляет к тексту новые предложения.
	 * 
	 * @param text
	 */
	public void add(String text) {

		String[] sentences = text.split("[\\.!?]\\s");

		for (String string : sentences) {
			this.add(new Sentence(string));
		}
	}

}
