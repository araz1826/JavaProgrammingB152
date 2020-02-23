package day11;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        int num,count;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number: ");
        num = scan.nextInt();
        count = 9;
        while(count<num) {
            System.out.print(count +", ");
            count+=2;

        }
    }
}
