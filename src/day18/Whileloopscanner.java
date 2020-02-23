package day18;

import java.util.Scanner;

public class Whileloopscanner {
    public static void main(String[] args) {
        String password ="B15";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String input = scan.nextLine();

        while(!input.equals(password)){
            System.out.println("Please enter your password again");
            input =scan.nextLine();
        }
        System.out.println("You are in!");

    }
}
