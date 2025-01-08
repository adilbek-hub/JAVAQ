package OOP.Inheritens;

public  class Lion extends Animals {
    public Lion(String name, int age,String species){
        super(name, age, species);
        this.maneSize = 50;

    }

    private int maneSize;


    public  int getManeSize(){
        return  maneSize;
    }
    public void setManeSize(int maneSize){
        this.maneSize = maneSize;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер гривы:" + maneSize);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("is eating" + super.getName());
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Roar!");
    }
}
