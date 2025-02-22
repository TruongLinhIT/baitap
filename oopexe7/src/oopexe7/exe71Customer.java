package oopexe7;

public class exe71Customer {
	private String name;
    private boolean member = false;
    private String memberType;

    public exe71Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        if (member) {
            this.memberType = type;
        } else {
            this.memberType = "None";
        }
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', member=" + member + ", memberType='" + memberType + "'}";
    }
}
