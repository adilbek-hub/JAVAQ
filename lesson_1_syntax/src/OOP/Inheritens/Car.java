package OOP.Inheritens;

public class Car extends Vechicle {
int numberOfDoor;
    public Car(String model, int years, int numberOfDoor) {
        super(model, years);
        this.numberOfDoor  = numberOfDoor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество дверей: " + numberOfDoor);
    }
}
