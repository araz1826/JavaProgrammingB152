package day18;

import java.util.Scanner;

public class DoPassword {
    public static void main(String[] args) {
        String password ="B15";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String input = scan.nextLine();

        do{
            System.out.println("You are in!");

        }while(!input.equals(password));
            System.out.println("Please enter your password again");
            input =scan.nextLine();

    }
}
