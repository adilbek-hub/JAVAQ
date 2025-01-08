package OOP.Inheritens;

public class Bycicle  extends  Vechicle{
    boolean hasKarsina;
    public Bycicle(String model, int years, boolean hasKarsina) {
        super(model, years);
        this.hasKarsina = hasKarsina;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Карзина есть или нет? " + hasKarsina);
    }
}
