package day06;

import java.util.Scanner;

public class CapturingMultipleWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = blabla.nextLine();

        System.out.println("Which city you live in and including your State? ");
        int city = blabla.nextInt();
        blabla.nextLine();

        System.out.println("What is you street address? ");
        String street = blabla.nextLine();

        System.out.println("Your name is " + name + "," + " you are from " + city + "," + " your street is " + street);


    }
}
