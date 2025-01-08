package Collections;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;
    public PhoneBook(){
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber){
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
        System.out.println("Контакт; " + name + " добавлен");
    }

    public  void removeContact(String name){
        contacts.removeIf(contact -> contact.getName().equals(name));
        System.out.println("Контакт: " + name + " удален");
    }

    public  void findContact(String name){
        boolean found = false;
        for(Contact contact : contacts){
            if(contact.getName().equals(name)){
                System.out.println(contact);
                found = true;
            }
            if(!found){
                System.out.println("Контакт с именем " + name + " не найдено");

            }


        }

    }

    public void displayAllContacts(){
        if(contacts.isEmpty()){
            System.out.println("Контактная книга пусто");
            return;
        }
        System.out.println("Все контакты");
        for(Contact contact : contacts){
            System.out.println(contact);
        }
    }

}
