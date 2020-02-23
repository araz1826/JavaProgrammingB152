package day20;

import java.util.Scanner;

public class BymySelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        String wordD=word;
        word=word.toLowerCase();
        while(word.contains("cat")){
            word=word.substring(word.indexOf("cat")+1);
            countOfCats++;
        }
        while(wordD.contains("dog")){
            wordD=wordD.substring(wordD.indexOf("dog")+1);
            countOfDogs++;
        }

        if(countOfDogs==countOfCats){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }

}
