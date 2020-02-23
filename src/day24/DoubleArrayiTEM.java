package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleArrayiTEM {
    public static void main(String[] args) {
        double[]prices={1.2,2.3,4.5};
        String numbers= Arrays.toString(prices);  // convert in ir double to string
        System.out.println("prices"+numbers+" ");
        for(int a=0; a<numbers.length(); a++){
            System.out.println("char at index"+numbers.charAt(a) +" "+ a);// find character of each item
        }

    }
}
