package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your score:");
        score = scan.nextInt();

        if(score <0 || score >100){
            System.out.println("Invalid score");
        } else if (score ==100){
            System.out.println("perfect score");
        } else if(score >70 && score <100){
            System.out.println("passed");
        } else{
            System.out.println("Failed");
        }

    }
}
