package day52Interface;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//there are 1 interface(Transferable) and 1 account class, mixed
public class WarmUp_BankAccount {
                                                          public static void main(String[] args) {
                                                              Account a1= new Account("John", 10000);
                                                              Account a2= new Account("ana", 7000);  //we used name for palindorme

                                                              System.out.println(a1);
                                                              System.out.println(a2);

                                                              a1.transferAll(a2);
                                                              System.out.println(a1);
                                                              System.out.println(a2);

                                                              a2.transferAll(a1);
                                                              System.out.println(a1);
                                                              System.out.println(a2);

                                                              System.out.println("is a2 palindrome: "+ a2.isPalindrome());
                                                              System.out.println("is a1 palindrome: "+ a1.isPalindrome());

                                                              //create a arrayList and sort it
                                                              List<Account> accountList=new ArrayList<>();
                                                              accountList.add(new Account("John", 1000));
                                                              accountList.add(new Account("emme", 2000));
                                                              accountList.add(new Account("ata", 34000));
                                                              accountList.add(new Account("Jaraz", 1050));

                                                              System.out.println("accountList before:\n="+accountList);
                                                              Collections.sort(accountList);  //sort method
                                                              System.out.println("after sorting \n="+accountList);

                                                              //create account with your name and transfer everybody money to your account

                                                              Account a4=new Account("araz", 3000);
                                                              for (Account each:accountList) {
                                                                  each.transferAll(a4);
                                                              }
                                                              System.out.println("after transfering all to mine: " +a4);
                                                          }
    public static interface Transferable {
        public abstract void transferAll(Account otherAccount);
    }


    public static class Account implements Transferable, Comparable<Account> {
        protected  String name;
        private int balance;
    
        public Account(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }

        @Override
    public void transferAll(Account otherAccount){
            //get the balance of current account , deposit to otheraccount
            //set current account balance to zero
            otherAccount.balance+=this.balance;
            this.balance=0;
    }
        public int getBalance()
        {
            return balance;
        }
    public void deposit(int amount)
    {
            balance+=amount;
    }
    public void withdraw(int amount){
            balance-=amount;
            
    }
    
        @Override
        public String toString() {
            return "Account{" +
                    "name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }
        //add a method called isPalindrome and return true if the name in palindrome
        //ignore case and space should not matter
        public boolean isPalindrome(){
         String nameCopy=this.name.toLowerCase().replace(" ","");

         String reverse="";
            for (int i = nameCopy.length()-1; i >=0 ; i--) {
                    reverse+=nameCopy.charAt(i);
            }
            return nameCopy.equals(reverse);
        }

        @Override
        public int compareTo(Account otherAccount) {      //Comparable
            if(this.balance>otherAccount.balance){
                return 1;
            }else if(this.balance<otherAccount.balance){
                return -1;
            }else {
                return 0;
            }


        }
    }

}
