package day12;

import java.util.Scanner;

public class EqualsPractice {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        name = scan.nextLine();
        System.out.println(name.equalsIgnoreCase("araz"));

    }
}
