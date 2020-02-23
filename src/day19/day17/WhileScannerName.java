package day19.day17;

import java.util.Scanner;

public class WhileScannerName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = scan.nextLine();

            int a=name.length()-1;
            while(a>=0){
                a--;
                if(a%2==0){
                    System.out.print(name.charAt(a));

                }




        }


    }
}
