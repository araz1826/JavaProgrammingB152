package day09;

import java.util.Scanner;

public class Newprac {
    public static void main(String[] args) {
        int input;
        String x;

        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        if(input % 2 == 0){
             x = "senior";
        } else{
            x = "not senior";
        }
        System.out.println(x);
    }
}
