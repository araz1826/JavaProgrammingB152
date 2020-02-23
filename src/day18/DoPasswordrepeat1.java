package day18;

import java.util.Scanner;

public class DoPasswordrepeat1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        do {
            System.out.println("enter your password");
             password = scan.nextLine();

        } while (!password.equals("araz"));
        System.out.println("you are in");
    }
}
