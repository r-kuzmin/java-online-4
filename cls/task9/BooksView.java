package by.training.cls.task9;

public class BooksView {

	private Books list;
	
	public Books getList() {
		return list;
	}

	public void setList(Books bks) {
		this.list = bks;
	}

	public BooksView() {
		this(new Books());
	}
	
	public BooksView(Books list) {
		super();
		this.list = list;
	}

	/**
	 * Отбирает из переданного списка книги указанного автора и выводит их на
	 * консоль.
	 * 
	 * @param title
	 * @param author
	 */
	public void booksByAuthor(String title, Person author) {
		System.out.println(title + ":");

		for (Book book : list) {
			for (Person bookAuthor : book.getAutors()) {
				if (bookAuthor.equals(author)) {
					System.out.println("\t" + book.getName() + "; " + autorsToString(book));
					break;
				}
			}
		}
	}

	/**
	 * Отбирает из переданного списка книги указанного издательства и выводит их на
	 * консоль.
	 * 
	 * @param title
	 * @param publisher
	 */
	public void booksByPublisher(String title, String publisher) {
		System.out.println(title + " " + publisher + ":");

		for (Book book : list) {
			if (book.getPublisher().equals(publisher)) {
				System.out.println("\t" + book.getName() + "; " + autorsToString(book));
			}
		}
	}

	/**
	 * Отбирает из списка книги, изданные после указанного года и выводит их на
	 * консоль.
	 * 
	 * @param title
	 * @param year
	 */
	public void booksAfterYear(String title, int year) {
		System.out.println(title + ":");

		for (Book book : list) {
			if (book.getYear() >= year) {
				System.out.println("\t" + book.getName() + "; " + autorsToString(book));
			}
		}
	}

	/**
	 * Формирует строковое представление списка авторов книги.
	 * 
	 * @param book
	 * @return
	 */
	private String autorsToString(Book book) {

		if (book == null) {
			return "";
		}

		Person[] bookAutors = book.getAutors();
		String[] authors = new String[bookAutors.length];

		for (int i = 0; i < bookAutors.length; i++) {
			authors[i] = bookAutors[i].getSurname() + " " + bookAutors[i].getName();
		}

		return String.join(", ", authors);
	}

}
