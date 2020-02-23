package day25;

import java.util.Scanner;

public class Replit120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String longest=""; // or String longest=words[0]
        for(String item: words){
            if(item.length()>longest.length()){
                longest=item;
            }

        }


        System.out.println(longest);
    }

}
