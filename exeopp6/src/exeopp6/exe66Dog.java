package exeopp6;

public class exe66Dog extends exe66Animal {
	public exe66Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(exe66Dog another) {
        System.out.println("Woooof");
    }

}
