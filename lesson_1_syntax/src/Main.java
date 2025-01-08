
import OOP.Inheritens.*;
import OOP.Inheritens.Encapsulation.BankAccount;
import OOP.Inheritens.Encapsulation.Cat;
import OOP.Inheritens.Encapsulation.Person;
import OOP.Inheritens.Polimorphism.Animal;
import OOP.Inheritens.Polimorphism.Dog;
import Collections.*;

import java.util.*;

//
public class Main {
    public static void main(String[] args) {
Car car = new Car("Toyota", 2024, 4);
car.displayInfo();
System.out.println("_______________________________________");

Bycicle bycicle = new Bycicle("Kama", 2024, true);
bycicle.displayInfo();

System.out.println("___________________________________________");

Circle circle = new Circle(10);
System.out.println("Площад круга: " + circle.getArea());
System.out.println("___________________________________________");
Rectangle rectangle = new Rectangle(4,6);
System.out.println("Площадь прямоугольника: " + rectangle.getArea());
System.out.println("___________________________________________");
// Полиморфизм
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog(" Kablan");
        // Восходящее преобразование (Upcasting)
        Animal myDogAnimal = dog; // Объект Dog присваивается переменной типа Animal, Это безопасно, так как Dog является подклассом Animal.
        myDogAnimal.makeSound(); // Выведет: Woof! (полиморфизм в действии)
        // Пример массива Animal
        Animal[] animals = new Animal[2];
        animals[0] = animal;
        animals[1] = dog;

        for (Animal animal1 : animals){
            animal1.makeSound(); // Полиморфный вызов makeSound() для каждого элемента массива
        }

     // Инкапсуляция
            System.out.println("____________________ Инкапсуляция_______________________");
            BankAccount myBankAccount = new BankAccount("202020", 1000);
        // Балансты текшерүү
            System.out.println("Сиздин балансыңыз: " + myBankAccount.getBalance());
            // Акча салуу
            myBankAccount.deposit(500);
            // Балансты текшерүү
            System.out.println("Сиздин балансыңыз: " + myBankAccount.getBalance());
            // Акча алуу
            myBankAccount.withdraw(658);
            // Балансты текшерүү
            System.out.println("Сиздин балансыңыз: " + myBankAccount.getBalance());
            System.out.println("___________________________________________");
            Cat cat = new Cat("Murka", 10);




            String catName = cat.getName();
            System.out.println("Имя кошки: " + catName);
            int catAge = cat.getAge();
            System.out.println("Возраст кошки: " + catAge);
            cat.setName("Vasia");
            String newCatNAme = cat.getName();
            System.out.println("Новое Имя кошки: " + newCatNAme);
            cat.setAge(50);
            int newCatAge = cat.getAge();
            System.out.println("Возраст новый кошки " + newCatNAme  + ":" + newCatAge);


            System.out.println("___________________________________________");
            Person person = new Person("Adilbek", 32);
            Person personn = new Person("Beka", 3);
            String personName1 = person.getPersonName();
            int personAge1 = person.getPersonAge();
            System.out.println("Имя человека " + personName1);
            System.out.println("Возраст " + personName1 + " " + personAge1);
            person.setPersonName("Nura");
            person.setPersonAge(25);
            String person2 = person.getPersonName();
            int personAge2 = person.getPersonAge();
            System.out.println("Имя человека " + person2);
            System.out.println("Возраст " + person2 + " " + personAge2);
            System.out.println(personn.getPersonName());
            System.out.println(personn.getPersonAge());
            personn.setPersonName("Амантур");
            personn.setPersonAge(5);
            System.out.println(personn.getPersonName());
            System.out.println(personn.getPersonAge());
        System.out.println("_____ALL PRINCIPE OOP_______________");
        Animals animals1 = new Animals();
        Animals lion = new Lion("LION", 20, "Хищник");
        String lionName = lion.getName();
        System.out.println("Имя у животного: " + lionName);
        lion.displayInfo();
        lion.eat();
        lion.makeSound();
        ///////////////////////////////////////
        Animals cow = new Cow("Cow", 10, "Траваедный");
        cow.eat();
        cow.displayInfo();
        cow.makeSound();
        cow.setName("MUMU");
        cow.displayInfo();
        /// /////////////////////////////////
        Animals cat1 = new Catt("MURMUR", 2, "Хищник");
       // Пример использования геттеров и сеттеров
        cat1.setName("KURASH");
        cat1.setAge(1);
        cat1.setSpecies("2");
        String newCatName = cat1.getName();
        int newCatAgee = cat1.getAge();
        String newCatSpesies = cat1.getSpecies();
        System.out.println(newCatName);

        Animals[] animals2 = new Animals[3];
        animals2[0] = new Lion("LION POWER", 10, "Хищник");
        animals2[1] = new Cow("AK UY", 3, "Траваедный");
        animals2[2] = new Catt("KARA MYSHYK", 2, "Хищник");
        // Полиморфный вызов makeSound(), displayInfo(), eat().
        for(Animals animals3 : animals2){
            animals3.displayInfo();
            animals3.makeSound();
            animals3.eat();
        }
        System.out.println("_____COLLECTIONS_______________");
        System.out.println("_______________ArrayList (список):________________");
        //metod add
        List<String> names = new ArrayList<>(); // создания ArrayList
        names.add("ASan");
        names.add("Uson");
        names.add("Kanat");
        names.add("Janat");
        System.out.println(names);

        // Доступ по индексу
        System.out.println(names.get(2));

        // Удаления по индексу
        System.out.println(names.remove(0));
        // Заново выводим
        System.out.println(names);
        // Проверка наличия элемента
        System.out.println(names.contains("Kanat"));

        System.out.println("_______________HashSet (множество):________________");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);

        System.out.println("_______________HashMap (ассоциативный массив/словарь)________________");
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alisa", 20);
        ages.put("Jhone", 30);
        ages.put("Alex", 40);
        ages.put("Fried", 50);
        System.out.println(ages);
        // Получение значения по ключу: 25
        System.out.println(ages.get("Jhone"));
        // Проверка наличия ключа
        System.out.println(ages.containsKey("Fried"));
        ages.remove("Alex");
        System.out.println(ages);
        //Перебор элементов Map
        for(Map.Entry<String, Integer> entry : ages.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("_______________4. Итерация по коллекциям:_________Для перебора элементов коллекций можно использовать цикл for-each или итератор (Iterator)._______");
        // Цикл for-each
        System.out.println("For-each loop:");
        for(String name : names){
            System.out.println(name);
        }
        // Итератор
        System.out.println("\nIterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("___ Phone Contact__");
    PhoneBook myPhoneBook = new PhoneBook();
    myPhoneBook.addContact("Adilbek", "996-999-29-12-10");
    myPhoneBook.addContact("Nura", "996-707-705-197");
    myPhoneBook.addContact("Amantur", "996-655-655-656");
    myPhoneBook.findContact("Adilbek");
    myPhoneBook.findContact("Fred");
    myPhoneBook.displayAllContacts();
    myPhoneBook.removeContact("Adilbek");
    myPhoneBook.displayAllContacts();












    }
}



// public - бул класска программанын каалаган жеринен кирүүгө болоорун көрсөткөн мүмкүндүк модификатору.
// class - классты жарыялаган ачкыч сөз.
// MyFirstClass — имя класса (должно начинаться с заглавной буквы).
// {} — фигурные скобки обозначают тело класса.
// Метод main() — это точка входа в программу. Именно с него начинается выполнение программы.
// static — ключевое слово, указывающее, что метод принадлежит классу, а не объекту класса.