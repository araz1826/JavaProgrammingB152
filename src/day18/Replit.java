package day18;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        String email= s.nextLine();

        if(email.contains(a)){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }



    }
}
