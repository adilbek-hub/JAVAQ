package OOP.Inheritens;

public class Cow extends  Animals{
    public Cow(String name, int age, String species){
        super(name, age, species);
    };

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(super.getName() + " is Mooo");
    }
}
