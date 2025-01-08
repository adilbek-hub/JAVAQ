package OOP.Inheritens.Polimorphism;

public class Dog extends  Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println( "WOFFF" + name);
    }
}
