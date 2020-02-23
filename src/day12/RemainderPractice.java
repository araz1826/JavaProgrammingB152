package day12;

import java.util.Scanner;

public class RemainderPractice {
    public static void main(String[] args) {
     String season = "";
     Scanner scan = new Scanner(System.in);
        System.out.println("please enter a season:");
     season = scan.nextLine();

     if(season.equalsIgnoreCase("Spring")){
         System.out.println("hiking, navruz, allergy season, cool weather");

     }else if (season.equalsIgnoreCase("summer")) {
         System.out.println("pool, swimming, beach, vacation");
     }else if (season.equalsIgnoreCase("fall")) {
         System.out.println("barbecue, riding bike");
     } else if (season.equalsIgnoreCase("winter")) {
         System.out.println("snow, cold, ski");
     } else{
         System.out.println("invalid entry,");

        }
    }
}
