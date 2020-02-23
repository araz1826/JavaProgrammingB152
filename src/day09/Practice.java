package day09;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int input;
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        if(input % 2 == 0){
            System.out.println("this is an even number");
        } else{
            System.out.println("this is an odd number");
        }
    }
}
