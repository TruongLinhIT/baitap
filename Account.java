package oopexe1;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account() {
		balance = 0;
	}
	
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		this.balance = this.balance + amount;
		return this.balance ;
	}
	
	public int debit(int amount) {
		
		if (amount<= this.balance) {
			this.balance=  this.balance - amount;
		}else {
			System.out.println("so tien vuot qua so du");
		}
		return this.balance;
	}
	
	public int transferTo (Account another , int amount) {
		another.balance = another.balance + amount;
		this.balance = this.balance - amount;
		return another.balance;
	}
	
	public String toString() {
		return "Account [id= "+this.id+",name= "+this.name+", balance= "+this.balance+"]";
	}
	
	public static void main(String[] args) {
		Account a1 = new Account("A101", "Tan Ah Teck", 88); 
	      System.out.println(a1);   // toString(); 
	      Account a2 = new Account("A102", "Kumar"); // số dư mặc định 
	      System.out.println(a2); // Các phương thức lấy dữ liệu kiểm tra 
	      System.out.println("ID: " + a1.getId()); 
	      System.out.println("Name: " + a1.getName()); 
	      System.out.println("Số dư: " + a1.getBalance()); // Kiểm tra credit() và debit() 
	      a1.credit(100); 
	      System.out.println(a1); 
	      a1.debit(50); 
	      System.out.println(a1); 
	      a1.debit(500);   // lỗi debit() 
	      System.out.println(a1); // Kiểm tra chuyển() 
	      a1.transferTo(a2, 100);   // toString() 
	      System.out.println(a1); 
	      System.out.println(a2);
	}

	
	
	
	
	

}
