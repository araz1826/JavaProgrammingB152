package day08;

import java.util.Scanner;

public class booleanPractice {
    public static void main(String[] args) {
        int speedLimit;
        int currentSpeed;

        Scanner scan =  new Scanner(System.in);
        System.out.println("please enter speedlimit");
        speedLimit = scan.nextInt();

        scan.nextLine();
        System.out.println("enter your current speed");
        currentSpeed = scan.nextInt();

        boolean amIspeeding =(currentSpeed > speedLimit);
        if(amIspeeding){
            System.out.println("pulled over by police");
        } else {
            System.out.println("go to shopping");
        }
    }
}
