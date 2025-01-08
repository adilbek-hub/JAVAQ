package OOP.Inheritens.Encapsulation;

public class Cat {
  private String name;
  private  int age;
    public  Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public  Cat(){}

    public String getName(){
        return  name;
    }

    public  int getAge(){
        return  age;
    }

    public  void setName(String name){
this.name = name;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }

    }
}
