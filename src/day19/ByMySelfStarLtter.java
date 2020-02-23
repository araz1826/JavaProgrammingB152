package day19;

import java.util.Scanner;

public class ByMySelfStarLtter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter two number:");

        int a=scan.nextInt();
        int b=scan.nextInt();

        for(int x=a; x<=b; x++){

            a=a+x;


        }
        System.out.println(a);
    }
}
