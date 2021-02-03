package by.training.agregation.task1;

import java.util.Arrays;

public class Word {

	private char[] symbols;

	public Word() {
		this(new char[0]);
	}

	public Word(String symbols) {
		this(symbols.toCharArray());
	}

	public Word(char[] symbols) {
		super();
		this.symbols = symbols;
	}

	public char[] getSymbols() {
		return symbols;
	}

	public void setSymbols(char[] symbols) {
		this.symbols = symbols;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(symbols);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (!Arrays.equals(symbols, other.symbols))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Word " + Arrays.toString(symbols);
	}

	public String getText() {
		return String.valueOf(symbols);
	}

}
