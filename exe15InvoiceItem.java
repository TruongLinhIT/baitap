package oopexe1;

public class exe15InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	public exe15InvoiceItem(String id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return this.unitPrice*this.qty;
	}
	
	public String toString() {
		return "InvoiceItem[id= "+this.id+",desc= "+this.desc+"qty= "+this.qty+",unitPrice= "+this.unitPrice+"]";
	}
	
	public static void main(String[] args) {
		exe15InvoiceItem inv1 = new exe15InvoiceItem("A101", "Pen Red", 888, 0.08);
	      System.out.println(inv1);  // toString();

	      // Test Setters and Getters
	      inv1.setQty(999);
	      inv1.setUnitPrice(0.99);
	      System.out.println(inv1);  // toString();
	      System.out.println("id is: " + inv1.getId());
	      System.out.println("desc is: " + inv1.getDesc());
	      System.out.println("qty is: " + inv1.getQty());
	      System.out.println("unitPrice is: " + inv1.getUnitPrice());

	      // Test getTotal()
	      System.out.println("The total is: " + inv1.getTotal());
	}

}
