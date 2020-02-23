package day27;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMinMaxwithoutArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    //how to find min number in array wihtout SORT  method
        int[] numbers = new int[5];

        for (int a = 0; a < 5; a++) {
            numbers[a] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        int min = numbers[0];
        for (int b = 0; b < 5; b++) {
            if (numbers[b] < min) {
                min = numbers[b];

            }
        }
        System.out.println(min);

        int min2 = numbers[0];                               //find the ++
        // second min number use CONTINUE
        for (int b = 0; b < 5; b++) {
            if (numbers[b] == min) {
                continue;
            }
            if(min2>numbers[b]){
                min2=numbers[b];
            }

        }
        System.out.println(min2);


        int min3 = numbers[0];                                        //third min number use CONTINUE
        for (int b = 0; b < 5; b++) {
            if (numbers[b] == min || numbers[b]==min2) {
                continue;
            }
            if(min3>numbers[b]){
                min3=numbers[b];
            }

        }
        System.out.println(min3);
    }
}
