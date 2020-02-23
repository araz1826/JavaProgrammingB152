package day16;

import java.util.Scanner;

public class ReversePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any word");
        String word=scan.nextLine();

        int len = word.length();
        for(int a= len-1; a>=0;a--){
            System.out.print(word.charAt(a));

        }

    }
}
