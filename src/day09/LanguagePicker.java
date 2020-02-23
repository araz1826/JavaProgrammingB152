package day09;

import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call center");
        System.out.println("Please select your language from 1-7");

        int number;
        String language = "";
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
