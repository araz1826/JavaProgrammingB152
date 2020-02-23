package day19.day17;

import java.util.Scanner;

public class ScannerWarmup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name:");
        String  name=scan.nextLine();
        int len= name.length();
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1,len).toLowerCase());

    }
}
