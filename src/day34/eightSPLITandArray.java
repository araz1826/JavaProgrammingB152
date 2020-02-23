package day34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class eightSPLITandArray {
    public static void main(String[] args) {
        String sentence="I love Java";
        char[] item=sentence.toCharArray();          //new method
        String [] splitter=sentence.split(" ");
        System.out.println(item);
        System.out.println(Arrays.toString(splitter));

        int[]resultarr=returnBoysvsGirls();
        System.out.println(Arrays.toString(resultarr));

        System.out.println(Arrays.toString(returnBoysvsGirls(2,3)));

    }
    public static int[] returnBoysvsGirls(){ //create a method that return int Array
        int [] boysgirlscount={56,62};
        return boysgirlscount;
    }
    public static int[] returnBoysvsGirls( int a, int b) { //create a method that return int Array
        int[] boysgirlscount = {a, b};
        return boysgirlscount;
    }
}
