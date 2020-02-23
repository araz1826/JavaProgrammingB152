package day09;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CitizentTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age;

        System.out.println("Please enter your age:");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();

        if (age > 65) {
            citizenType = "senior";
        } else {
            citizenType = "not citizen";
        }
        System.out.println("The citizen age is " + age + ", he is a " + citizenType);


    }
}
