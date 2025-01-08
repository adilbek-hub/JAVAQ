package OOP.Inheritens;

public class Catt extends  Animals{
    public Catt(
            String name, int age, String species){
        super(name,age, species);
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
        System.out.println( super.getName() + " Miauuuu");
    }
}

