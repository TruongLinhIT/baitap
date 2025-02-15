package oopexe1;

public class exe14Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	public exe14Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstName + this.lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getAnnualSalary() {
		return this.salary*12;
	}
	
	public double raiseSalary(double percent) {
		double raise = this.salary + this.salary*(percent/100);
		this.salary= raise;
		
		return raise;
	}
	
	public String toString() {
		return "Employee[id= "+this.id+",name="+getName()+",salary= "+this.salary+"]";
	}
	public static void main(String[] args) {
		exe14Employee e1 = new exe14Employee(8, "Peter", "Tan", 2500); 
	      System.out.println(e1);   // toString(); // Kiểm tra các bộ thiết lập và bộ lấy 
	      e1.setSalary(999); 
	      System.out.println(e1)   ; // toString(); 
	      System.out.println("id là: " + e1.getId()); 
	      System.out.println("firstname là: " + e1.getFirstName()); 
	      System.out.println("lastname là: " + e1.getLastName()); 
	      System.out.println("salary là: " + e1.getSalary()); 
	      System.out.println("name là: " + e1.getName()); 
	      System.out.println("annual salary là: " + e1.getAnnualSalary()); // Phương thức kiểm tra // Kiểm tra raiseSalary() 
	      System.out.println(e1.raiseSalary(10)); 
	      System.out.println(e1); 
	}

}
