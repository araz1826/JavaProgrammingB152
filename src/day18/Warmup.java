package day18;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int len = word.length();

        for(int a = len-1 ; a>=0; a--) {
            if (len == 5) {
                System.out.print(word.charAt(a));
            } else if (len < 5) {
                System.out.print("Too short!");
            } else if (len > 5) {
                System.out.print("Too long!");
            }
        }
    }
}
