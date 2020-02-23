package day18;

import java.util.Scanner;

public class Giveme$20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scan.nextInt();

        while(number!=5 && number!=20){
            System.out.println("This is not a right number, please enter again:");
            number =scan.nextInt();
        }
        System.out.println("Thanks");
    }
}
