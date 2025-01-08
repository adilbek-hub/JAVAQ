package OOP.Inheritens;

public class Vechicle {
    String model;
    int years;

    public  Vechicle(String model, int years){
        this.model = model;
        this.years = years;
    }

    public void displayInfo(){
        System.out.println("Model: " + model + " years: " + years);
    }
}
