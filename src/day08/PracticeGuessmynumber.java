package day08;

import java.util.Scanner;

public class PracticeGuessmynumber {
    public static void main(String[] args) {

        String password = "araz";
        System.out.println("Please enter your password");

        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();

        while(!guess.equals("araz")){
            System.out.println("try again");
            guess = scan.nextLine();
        }
        System.out.println("welcome in");



    }
}
