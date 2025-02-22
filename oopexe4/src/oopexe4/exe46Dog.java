package oopexe4;

public class exe46Dog extends exe46Mammal {
	public exe46Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(exe46Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
    public static void main(String[] args) {
        exe46Animal a1 = new exe46Animal("GenericAnimal");
        System.out.println(a1);

        exe46Mammal m1 = new exe46Mammal("Mammal1");
        System.out.println(m1);

        exe46Cat c1 = new exe46Cat("Kitty");
        System.out.println(c1);
        c1.greets();

        exe46Dog d1 = new exe46Dog("Buddy");
        System.out.println(d1);
        d1.greets();

        exe46Dog d2 = new exe46Dog("Rocky");
        d1.greets(d2);
    }

}
