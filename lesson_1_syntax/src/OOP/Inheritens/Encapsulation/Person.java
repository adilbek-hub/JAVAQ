package OOP.Inheritens.Encapsulation;

public class Person {
    private String personName;
    private int personAge;
   public  Person(String personName, int personAge){
      setPersonName(personName);
      setPersonAge(personAge);
   }
   public  String getPersonName(){
       return  personName;
   }
   public int getPersonAge(){
       return personAge;
   }
   public void setPersonName(String personName){
       this.personName = personName;
   }
   public  void setPersonAge(int personAge){
       this.personAge = personAge;
   }
}
