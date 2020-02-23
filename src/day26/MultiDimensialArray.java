package day26;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensialArray {                     //number are greater than 100, count and sort
    public static void main(String[] args) {
        int[] scores= new int[]{156,101,76,87,187,110};
      Arrays.sort(scores);
        int count=0;
        for(int a=0; a<scores.length; a++){
            if(scores[a]>100){

                System.out.print(scores[a]+" ");
                count++;

            }
        }
        System.out.println();
        System.out.println("numbers greater than 100:"+ count);


    }
}
