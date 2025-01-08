package OOP.Inheritens;

public class Animals {
    private  String name;
    private  int age;
    private  String species; // Вид
    public Animals(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public Animals(){}
    //GETTERS
    public String getName(){
        return name;
    }
    public  int getAge(){
        return  age;
    }
    public  String getSpecies(){
        return  species;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    //сеттер с валидацией
    public  void  setAge(int age){
        if(age >= 0 && age < 100){
            this.age = age;
        }else{
            System.out.println("Некорректный возраст");
        }

    }
    public  void setSpecies(String species){
        this.species = species;
    }

    public  void displayInfo(){
        System.out.println("Имя: " + name + " Возраст: " + age + " Вид: " + species);

    }

    public  void eat(){
        System.out.println(name + " is eating");
    }

    public  void makeSound(){
        System.out.println("Generic animal sound.");
    }
}

