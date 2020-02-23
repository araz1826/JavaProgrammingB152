package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String myName = scan.next();
        System.out.println("Your name is: " + myName);
        System.out.println("Age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

    }
}




