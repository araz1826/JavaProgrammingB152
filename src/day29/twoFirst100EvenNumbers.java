package day29;

import java.util.Arrays;

public class twoFirst100EvenNumbers {
    public static void main(String[] args) {     //starting from zero double the number in array
        int [] numbers= new int[100];
        int even= numbers[0];                      //if question ask you to double until 100, then put 50 in array bracket
        for(int a=0; a<numbers.length; a++){
            numbers[a]=a*2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
