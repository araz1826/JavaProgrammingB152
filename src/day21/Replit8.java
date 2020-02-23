package day21;

import java.util.Scanner;

public class Replit8 {
    public static void main(String[] args) {
        String guest;
        String answer;
        String name;
        String guest1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        guest = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        answer = input.nextLine();

        while(answer.equals("yes")){
            System.out.println("Please enter guest name:");
            guest1 = input.nextLine();
            guest= guest+", "+guest1;
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();



        }

        System.out.println("Guest's list: " +guest );
    }
}
