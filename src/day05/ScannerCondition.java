package day05;
import java.util.Scanner;

public class ScannerCondition {
   public static void main(String[] args){

       Scanner info = new Scanner(System.in);

       System.out.println("Enter your age:");
       int x = info.nextInt();
       if(x >= 18){
           System.out.println("You are allowed to enter, Welcome!");
       } else {
           System.out.println("Unfortunately you are not allowed to enter!");
       }


    }
}
