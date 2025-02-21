package oopexe2;

public class exe23Author {
	private String name;
	private String email;
	
	public exe23Author(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + "]";
	}
}
