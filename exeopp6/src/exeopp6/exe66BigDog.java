package exeopp6;

public class exe66BigDog extends exe66Dog {
	public exe66BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WoooW");
    }

    @Override
    public void greets(exe66Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(exe66BigDog another) {
        System.out.println("Wooooooooow");
    }
    public static void main(String[] args) {
        exe66Animal cat = new exe66Cat("Kitty");
        cat.greets();

        exe66Dog dog1 = new exe66Dog("Rex");
        dog1.greets();

        exe66Dog dog2 = new exe66Dog("Buddy");
        dog1.greets(dog2);

        exe66BigDog bigDog1 = new exe66BigDog("Max");
        bigDog1.greets();
        
        exe66BigDog bigDog2 = new exe66BigDog("Rocky");
        bigDog1.greets(bigDog2);
        bigDog1.greets(dog1);
    }

}
