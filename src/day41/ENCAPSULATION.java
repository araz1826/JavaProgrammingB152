package day41;

import com.sun.security.jgss.GSSUtil;
import day40.BankAccount;

public class ENCAPSULATION {
    //IT is RESTRICTION to access to their inner works of class/object
    //it is hiding data

    //4 access modifier: public protected default private
    //public: you access everywhere
    //private: accessible only for same class
    //default: same class and same package: if there is no access modifier in front of the method
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.showAccountBalance();

        //b1.balance=1000; // gives error. add default to front of balance at BankAccount class.
//double balance; -----default double balance;

        Person2 p1=new Person2();
        //p1.name="Hasan";  //if I put private at Peron2, you will not have an access
        //p1.age=19;
        //p1.ssn=123456789;   // it is default you can access (check Person2 Class))



        System.out.println(p1.getName());

        p1.setName("araz");
        System.out.println(p1.getName());

        p1.setAge(35);
        System.out.println(p1.getAge());

        p1.setSsn(1234567);
        System.out.println(p1.getSsn());

        System.out.println(p1); //this prints all beacuse toString method created

    }
}
