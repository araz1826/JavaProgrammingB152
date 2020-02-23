package day46;

public class CheckingAccount extends BankAccount{
    //no additional fiels but still have 3 field from super class



    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance);
    }
    //if your deposit over 3000 you get extar 200 usd

    public void deposit(int amount){

    }


}
