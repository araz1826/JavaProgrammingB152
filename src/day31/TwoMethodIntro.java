package day31;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;    //why do we have a method: it is a reusable code.

public class TwoMethodIntro {
    public static void sayHello(){
        System.out.println("Hello world");
        System.out.println("my name is Araz");   // these are reuseable method you call anytime
        System.out.println("I love java");

        String name="araz";
        char [] chr=name.toCharArray();
        System.out.println(Arrays.toString(chr));
    }
    public static void main(String[] args) {

       sayHello();                 // you call sayHello class, that will print out all in sayHello class.
        //MethodIntro.sayHello();     // you can also call sayHello class with this method,

        System.out.println("begin");
        sayHello();
        System.out.println("end");
        sayHello();

    }
    //do not create a method inside main method, create outside, basically not in main method above.

}
