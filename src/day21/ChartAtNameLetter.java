package day21;

import java.util.Scanner;

public class ChartAtNameLetter {
    public static void main(String[] args) {
        String name="araz";
        for(int a=0; a<name.length();a++){
            System.out.print(name.charAt(a)+">");

        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter and number");
        int number=scan.nextInt();
        String numToLetter= Integer.toString(number);
        for(int a=0; a<numToLetter.length(); a++){
            System.out.println(numToLetter.charAt(a));
        }

        int sum=0;
        for(int a =1; a<5; a++){
            System.out.println(a);
            sum=sum+a;
        }
        System.out.println(sum);

        String star="";
        for(int s =1; s<5; s++) {
            star = star + "*";
            System.out.println(star);

        }
    }
}
