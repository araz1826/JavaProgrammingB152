package day05;

import java.util.Scanner;

public class DayMinScanner {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("enter a day");
        double day = info.nextDouble();
        double min = (day * 24 * 60);
        System.out.println("There are " + " " + min + "min " + day + " days");
    }
}
