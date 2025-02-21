package oopexe2;

public class exe23Book {

	private String isbn;
		private String name;
		private exe23Author author;
		private double price;
		private int qty;
		public exe23Book(String isbn, String name, exe23Author author, double price) {
			super();
			this.isbn = isbn;
			this.name = name;
			this.author = author;
			this.price = price;
			this.qty=0;
		}
		
		public exe23Book(String isbn, String name, exe23Author author, double price, int qty) {
			super();
			this.isbn = isbn;
			this.name = name;
			this.author = author;
			this.price = price;
			this.qty = qty;
		}
		public String getIsbn() {
			return isbn;
		}
		
		public String getName() {
			return name;
		}
		
		public exe23Author getAuthor() {
			return author;
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
		public String getAuthorName() {
			 return author.getName();
		 }
	
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty
					+ "]";
		}
		public static void main(String[] args) {
			exe23Author a1 = new exe23Author("Tan Ah Teck", "ahteck@nowhere.com");
		      System.out.println(a1);
	
		      a1.setEmail("ahteck@somewhere.com");
		      System.out.println(a1);
		      System.out.println("name is: " + a1.getName());
		      System.out.println("email is: " + a1.getEmail());
	
		      // Test Book class
		      exe23Book b1 = new exe23Book("12345", "Java for dummies", a1, 8.8, 88);
		      System.out.println(b1);
	
		      b1.setPrice(9.9);
		      b1.setQty(99);
		      System.out.println(b1);
		      System.out.println("isbn is: " + b1.getIsbn());
		      System.out.println("name is: " + b1.getName());
		      System.out.println("price is: " + b1.getPrice());
		      System.out.println("qty is: " + b1.getQty());
		      System.out.println("author is: " + b1.getAuthor());  // Author's toString()
		      System.out.println("author's name: " + b1.getAuthorName());
		      System.out.println("author's name: " + b1.getAuthor().getName());
		      System.out.println("author's email: " + b1.getAuthor().getEmail());
		}
	
}
