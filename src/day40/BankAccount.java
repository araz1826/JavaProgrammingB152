package day40;   //day 41 &ENCAPSULATION together

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    // setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {

        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance; //it i
    }
    // showAccountBalance
    public void showAccountBalance() {
        System.out.println("current balance = " + balance);
    }

    // showAccountHolderAccountType
    public void showAccountHolderAccountType() {
        System.out.println("accountType = " + accountType);
    }

    // getBalance  return the balance
    public double getBalance() {
        // after doing a lot of validation to make sure you have correct credential to view the balance
        return balance;
    }}