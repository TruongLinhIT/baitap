package oopexe7;

import java.util.Date;

public class exe71Visit {
	private exe71Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public exe71Visit(String name, Date date) {
        this.customer = new exe71Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense() {
        double serviceDiscount = exe71DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = exe71DiscountRate.getProductDiscountRate(customer.getMemberType());
        return (serviceExpense * (1 - serviceDiscount)) + (productExpense * (1 - productDiscount));
    }

    @Override
    public String toString() {
        return "Visit{customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "}";
    }
    public static void main(String[] args) {
        exe71Customer c1 = new exe71Customer("John Doe");
        c1.setMember(true);
        c1.setMemberType("Premium");

        exe71Visit v1 = new exe71Visit(c1.getName(), new Date());
        v1.setServiceExpense(100);
        v1.setProductExpense(50);

        System.out.println(v1);
        System.out.println("Total Expense after Discount: " + v1.getTotalExpense());
    }
}
