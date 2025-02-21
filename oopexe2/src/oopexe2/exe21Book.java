package oopexe2;

public class exe21Book {
	private String name;
	private exe21Author author;
	private double price;
	private int qty;
	
	public exe21Book() {
		this.price=0;
	}
	
	public exe21Book(String name, exe21Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		
	}



	public exe21Book(String name, exe21Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public exe21Author getAuthor() {
		return this.author;
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
	
	public String toString() {
		return "Book[name= "+this.name+",Author[name= "+this.author.getName()+",email= "+this.author.getEmail()+",gender= "+this.author.getGender()+"],price= "+this.price+",qty= "+this.qty+"]";
	}
	
	public static void main(String[] args) {
		exe21Author ahTeck = new exe21Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck);  // Author's toString()

		exe21Book dummyBook = new exe21Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);  // Test Book's toString()

		// Test Getters and Setters
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

		// Use an anonymous instance of Author to construct a Book instance
		exe21Book anotherBook = new exe21Book("more Java", 
		      new exe21Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);  // toString()
	}
}
