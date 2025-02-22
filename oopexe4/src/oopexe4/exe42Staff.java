package oopexe4;

public class exe42Staff extends exe42Person {
	private String school;
    private double pay;

    public exe42Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }

    public double getPay() { return pay; }
    public void setPay(double pay) { this.pay = pay; }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
    
    public static void main(String[] args) {
        // Tạo một đối tượng Person
        exe42Person person = new exe42Person("Nguyen Van A", "123 Nguyen Trai, Hanoi");
        System.out.println(person);

        // Tạo một đối tượng Student
        exe42Student student = new exe42Student("Le Van B", "456 Hoang Hoa Tham, Hanoi", "Computer Science", 2, 5000.0);
        System.out.println(student);

        // Tạo một đối tượng Staff
        exe42Staff staff = new exe42Staff("Tran Thi C", "789 Le Loi, HCMC", "ABC School", 2000.0);
        System.out.println(staff);

        // Cập nhật thông tin
        student.setYear(3);
        student.setFee(5500.0);
        staff.setPay(2200.0);

        // In lại thông tin
        System.out.println("After updates:");
        System.out.println(student);
        System.out.println(staff);
    }
}
