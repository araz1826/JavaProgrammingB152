package day05;

import java.util.Scanner;

public class TemperatureCoverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wht is the temperature");
        double fare = scan.nextDouble();
        double cel = (5.0/9) * (fare - 32);
        System.out.println("fare " + fare + "  is  " + cel);

    }
}
