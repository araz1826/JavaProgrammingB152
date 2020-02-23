package day22;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] numbers= new int[4];

        for(int x=0; x<numbers.length;x++){
            System.out.println("Enter you number" + (x+1));
            numbers[x]=scan.nextInt();

        }
        for(int x=0; x<numbers.length;x++) {
            System.out.print(numbers[x]+ " ");
        }
    }
}
