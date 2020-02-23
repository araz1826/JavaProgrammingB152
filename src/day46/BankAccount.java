package day46;

public class BankAccount {   //super class

    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount() {//always add empty constructor
                    //to avoid the issues in sub classes
           }

    public BankAccount(String accountHolder, long accountNum, double balance) {

        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public void deposit(int amount){
        this.balance+=amount;    //add amount to balance

    }
    public void withdraw(int amount){
        balance-=amount;    //you withdraw some money
    }
}
