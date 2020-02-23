package day15;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();


        if(name.contains("a") || name.contains("e")){
            System.out.println("name contains a or e");

        }else{
            System.out.println("none of them");
        }
    }
}
