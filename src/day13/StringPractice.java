package day13;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Araz ";
        System.out.println(name.toUpperCase());
        System.out.println("My name is " + name);
        System.out.println(name.toLowerCase());
        System.out.println("My name is" + name);
        System.out.println(name.equalsIgnoreCase("araz"));
        System.out.println(name.equals("ARAZ"));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.startsWith("a"));

    }
}
