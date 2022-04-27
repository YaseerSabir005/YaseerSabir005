package Sabir_U8Programs;
/**
 * 
 * Name: Yaseer Sabir
 * Title: Book
 */
public class Book implements Product {// This is implementing Product interface

	private double cost;
	private String title;
	private int pages;

	public Book(String title, double cost, int pages) {// here we are instantiating the variables

		this.cost = cost;
		this.title = title;
		this.pages = pages;
	}

	public String getTitle() {

		return title;
	}

	@Override
	public boolean equals(Object other) {

		if (this.title.equals(((Book) other).getTitle()))// here we override the equals method, casting is needed
			return true;
		return false;
	}

	@Override
	public double getPrice() {

		return cost;
	}

	@Override
	public void setPrice(double x) {

		cost = x;
	}

	public int getPages() {
		
		return pages;
		
	}

	@Override
	public String toString() {
		
		return  "\"" + title + "\"" + ", " + pages+ " pages,"+ " $" + cost;// this is the toString method to print the values
	}

}
