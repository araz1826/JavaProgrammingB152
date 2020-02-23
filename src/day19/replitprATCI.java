package day19;

import java.util.Scanner;

public class replitprATCI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

            if (word.contains("cat") && word.contains("dog")) {
                System.out.println("true");

            }else{
                System.out.println("false");
            }
        }
    }

