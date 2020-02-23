package day09;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        int number;
        String language = "";
        System.out.println("Please enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number == 1) {
            language = "Hello";
        } else if (number == 2) {
            language = "Salam";
        } else if (number == 3) {
            language = "Hola";
        } else if (number == 4) {
            language = "Privet";
        } else if (number == 5) {
            language = "Merhaba";
        } else if (number == 6) {
            language = "Szia";
        } else if (number == 7) {
            language = "bonjour";
        } else {


        }
        System.out.println(language + ", SDET");
    }
}
