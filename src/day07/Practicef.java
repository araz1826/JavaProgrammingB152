package day07;

import java.util.Scanner;

public class Practicef {
    public static void main(String[] args) {
        System.out.println("Enter your name, last name, company and email by space:");


        Scanner scan = new Scanner(System.in);
        String firstName, lastName, company, email;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();

        email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println(firstName+lastName+company+email);

    }
}
