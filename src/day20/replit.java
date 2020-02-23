package day20;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int len = word.length()-1;
        System.out.println(word.substring(0,1)+word.substring(len));
        }
    }