package oopexe2;

public class exe24Invoice {
	private int id;
    private exe24Customer customer;
    private double amount;

    public exe24Invoice(int id, exe24Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public exe24Customer getCustomer() {
        return customer;
    }

    public void setCustomer(exe24Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
    
    public static void main(String[] args) {
    	
    		      // Test Customer class
    			   exe24Customer c1 = new exe24Customer(88, "Tan Ah Teck", 10);
    		      System.out.println(c1);  // Customer's toString()

    		      c1.setDiscount(8);
    		      System.out.println(c1);
    		      System.out.println("id is: " + c1.getId());
    		      System.out.println("name is: " + c1.getName());
    		      System.out.println("discount is: " + c1.getDiscount());

    		      // Test Invoice class
    		      exe24Invoice inv1 = new exe24Invoice(101, c1, 888.8);
    		      System.out.println(inv1);

    		      inv1.setAmount(999.9);
    		      System.out.println(inv1);
    		      System.out.println("id is: " + inv1.getId());
    		      System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
    		      System.out.println("amount is: " + inv1.getAmount());
    		      System.out.println("customer's id is: " + inv1.getCustomerId());
    		      System.out.println("customer's name is: " + inv1.getCustomerName());
    		      System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
    		      System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    		   
	}
}
