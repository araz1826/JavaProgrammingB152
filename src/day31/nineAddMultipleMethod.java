package day31;

import java.util.Arrays;

public class nineAddMultipleMethod {
    public static void main(String[] args) {
        calculator(3,4);
      add3numbers(1,2,3);
    }
    public static void calculator(int num1, int num2){   // two parameters
        int sum= num1+num2;
        System.out.println("result is "+num1+num2);
    }
    public static void add3numbers(int a, int b, int c){ //three parameters
        System.out.println("result is "+ (a+b+c));

    }


}
