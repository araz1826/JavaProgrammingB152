package day27;

import java.util.*;

public class ScannerArrayTask {
    public static void main(String[] args) {      //assign 5 numbers in scanner then assign to in arrays

        Scanner scan =new Scanner(System.in);
        int[] numbers= new int[5];
        for( int a=0; a<5; a++){
            numbers[a]=scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        int maxNumber=numbers[numbers.length-1];
        System.out.println("max:"+ maxNumber);                  //finding max number

        int minNumber= numbers[0];
        System.out.println("min:" +minNumber);                   //finding min number




    }
}
