package oopexe2;

public class exe21Author {
	private String name;
	private String email;
	private char gender;
	public exe21Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public char getGender() {
		return this.gender;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	public static void main(String[] args) {
		exe21Author ahTeck = new exe21Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
		System.out.println(ahTeck);  // Test toString()
		ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
		System.out.println("name is: " + ahTeck.getName());     // Test getter
		System.out.println("email is: " + ahTeck.getEmail());   // Test getter
		System.out.println("gender is: " + ahTeck.getGender());
	}
}
