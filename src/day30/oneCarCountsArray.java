package day30;

import java.util.Arrays;

public class oneCarCountsArray {                              //Create a class called CarInventory with main
                                                            // count how many Chevrolet is in this array
                                                            // and how many civic you have
    public static void main(String[] args) {
       String[] carInventory= {"Acura-NSX", "Chevrolet-Corvette", "Chevrolet-Cavalier", "BMW-3 Series", "Pontiac-LeMans",
               "BMW-7 Series", "Oldsmobile-Achieva", "Honda-Civic"};

       int count=0;
       int count2=0;

        for(String item: carInventory){
            if(item.toLowerCase().contains("Chevrolet")){    // if it is case insensitive
                count++;
            }
            if(item.contains("Civic")){
                count2++;
            }
        }
        System.out.println("chevy: "+count);
        System.out.println("civic: "+count2);


    }
}
