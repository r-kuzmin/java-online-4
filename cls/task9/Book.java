package by.epam.training.cls.task9;

import java.util.Arrays;

public class Book {

	private int id;
	private String name;
	private Person[] autors;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	private BindingType binding;

	public Book() {
		this(0, "", new Person[0], "", 0, 0, 0, BindingType.HARD);
	}

	public Book(int id, String name, Person[] autors, String publisher, int year, int pages, double price,
			BindingType binding) {
		
		super();
		this.id = id;
		this.name = name;
		this.autors = autors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person[] getAutors() {
		return autors;
	}

	public void setAutors(Person[] autors) {
		this.autors = autors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BindingType getBinding() {
		return binding;
	}

	public void setBinding(BindingType binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(autors);
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (!Arrays.equals(autors, other.autors))
			return false;
		if (binding != other.binding)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", autors=" + Arrays.toString(autors) + ", publisher=" + publisher
				+ ", year=" + year + ", pages=" + pages + ", price=" + price + ", binding=" + binding + "]";
	}

}
