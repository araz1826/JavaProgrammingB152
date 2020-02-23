package day43;

import java.util.ArrayList;
import java.util.List;

public class CoffeeRelease2 {
    public static void main(String[] args) {

        Coffee2 c1=new Coffee2();// if you do not put args that will print out the constructor without args
        System.out.println("c1"+c1);
        c1.setType("turkish coffee");
        c1.setCaffeineLevel(4);
        c1.setPrice(3);
        System.out.println("c1="+c1.toString());

        Coffee2 c2=new Coffee2("Intensito",9);//if you put 2 parameter, that will print out the consrtctor with 2 args
        System.out.println("c2"+c2);


        Coffee2 c3=new Coffee2("Blonde",5,1.6);
        System.out.println("c3"+c3);
        c3.setPrice(-100);
        System.out.println("c3"+c3);

        Coffee2 c4=new Coffee2("Latte", 3,-2.6);//invalid price less than1 usd we put in constructor
        System.out.println("c4"+c4);

    }
}
