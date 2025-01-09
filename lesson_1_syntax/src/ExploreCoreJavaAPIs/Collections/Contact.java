package ExploreCoreJavaAPIs.Collections;

public class Contact {
    private  String name;
    private  String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(){}

    public  String getName(){
        return  name;
    }

    public  String getPhoneNumber(){
        return  phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {  // Для удобного вывода информации о контакте
        return "Имя: " + name + ", Телефон: " + phoneNumber;
    }
}
