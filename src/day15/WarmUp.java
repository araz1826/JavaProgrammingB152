package day15;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        if(name.length()<=4){
            System.out.println("short name");
        }else if(name.length()>=5 && name.length()<=10){
            System.out.println("medium name");
        }else if(name.length()>11){
            System.out.println("longer name");
        }

    }
}
