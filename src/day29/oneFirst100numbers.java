package day29;

import java.util.Arrays;

public class oneFirst100numbers {
    public static void main(String[] args) {   //first 100 number in array
        int [] numbers= new int[100];
        int even= numbers[0];
        for(int a=0; a<numbers.length; a++){
           numbers[a]=a+1;



        }
        System.out.println(Arrays.toString(numbers));

    }
}
