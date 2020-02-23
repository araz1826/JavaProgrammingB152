package day13;

import java.util.Scanner;

public class AmazonWarmup {
    public static void main(String[] args) {
        String shop, respond;
        boolean shopping = true;
        Scanner scan = new Scanner (System.in);
        System.out.println("Do you want to shooping?");
        respond = scan.nextLine();

        if(respond.equalsIgnoreCase("yes")){
            System.out.println("do you want to online shopping?");
            shop = scan.nextLine();
            if(shop.equalsIgnoreCase("yes")){
                System.out.println("Welcome online shoppoing");
            }else{
                System.out.println("please try our local store");
            }
        } else{
            System.out.println("please try visit some time later");
        }

    }
}
