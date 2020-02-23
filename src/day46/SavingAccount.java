package day46;

public class SavingAccount extends BankAccount{

    double interestRate;

    @Override  //this is override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
       super(accountHolder,accountNum,balance); //come from super class
        this.interestRate=interestRate;

    }
    // in saving account, if you remove money you will be charged 30 usd;
//how do you override withdraw method to saving account
    //@Override  // we override, always put override to understand that this is override
    public void withdraw(int amount){
        balance-=amount;
        balance-=30; //you withdraw some money, penalty fee
    }


    public void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Araz", 123445, 50000, 3.4);
        System.out.println(s1);
        //System.out.println(s1.toString()); you can also call like this, automatically call this

        s1.withdraw(10000);
        System.out.println("s1  after withdrawal= " + s1);

        super.withdraw(30); //super. means calling directly from supe class



        }
        //lets add interest rate 4.2 for each 100 deposit. OVERRIDE
    public void deposit(int amount){ //overriding, always happen in sub class
        balance+=amount+amount*interestRate;
        super.deposit(30);
    }

}
