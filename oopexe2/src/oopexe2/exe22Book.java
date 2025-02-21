package oopexe2;

import java.util.Arrays;

public class exe22Book {
	private String name;
	private exe21Author[] authors;
	private double price;
	private int qty;
	
	public exe22Book(String name, exe21Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = 0;
	}

	public exe22Book(String name, exe21Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	public exe21Author[] getAuthors() {
		return this.authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book2 [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	
	public String setAuthorNames() {
		StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i < authors.length - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    
	}
	public static void main(String[] args) {
		exe21Author[] authors = new exe21Author[2];
		authors[0] = new exe21Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new exe21Author("Paul Tan", "Paul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		exe22Book javaDummy = new exe22Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);  // toString()
	}
}
