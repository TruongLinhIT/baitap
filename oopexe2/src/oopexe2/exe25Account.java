package oopexe2;

public class exe25Account {
	private int id;
    private exe25Customer customer;
    private double balance = 0.0;

    public exe25Account(int id, exe25Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public exe25Account(int id, exe25Customer customer) {
        this(id, customer, 0.0);
    }

    public int getId() {
        return id;
    }

    public exe25Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public exe25Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public exe25Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
   
}
