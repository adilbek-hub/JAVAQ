package OOP.Inheritens.Encapsulation;

public class BankAccount {
    private  String accountNumber; // Жашыруун маалымат
    private  double balance; // Жашыруун маалымат
    public  BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Баланс алуу үчүн метод (Getter)
    public  double getBalance(){
        return  balance;
    }


    // Акча кошуу үчүн метод
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Сумма туура эмес");
        }
    }

    // Акча алуу үчүн метод
    public  void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
        }else{
            System.out.println("Эсепте жетиштүү каражат жок же сумма туура эмес!");
        }
    }
}
