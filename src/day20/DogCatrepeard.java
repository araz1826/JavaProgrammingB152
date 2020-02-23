package day20;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DogCatrepeard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        while(word.contains("cat")){
            word = word.substring(word.indexOf("dog")+1);
            countOfCats++;
        }

        while (word.contains("dog")){
            word = word.substring(word.indexOf("dog")+1);
            countOfDogs++;
        }

        if (countOfCats == countOfDogs) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
