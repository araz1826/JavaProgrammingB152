package day36;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class sixARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Long> lst4= new ArrayList<>();
        lst4.add(12L);
        lst4.add(13L);
        lst4.add(15L);
        lst4.add(16L);

        lst4.add(1,15L); //add number to index 1
        System.out.println(lst4);

        System.out.println(lst4.remove(12L));// you can add index number then delete that index or put eaxclt the 100

        System.out.println(lst4.indexOf(13L)); //LOCATION of 13L if INDEXOF

        System.out.println(lst4.indexOf(50));//IF you do not have that number gives you -1 (u may use for IF statement)

        System.out.println(lst4.isEmpty());//is EMPTY or not

        System.out.println(lst4.size()>0);  // this tells you list is empty or there is something

        System.out.println(lst4.contains(12l));// this tells you contains

        System.out.println(lst4.indexOf(12l)!=-1);//without CONTAIN, you can use if statement ==-1. it means I have it

    }
}
