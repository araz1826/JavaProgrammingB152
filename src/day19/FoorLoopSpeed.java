package day19;

import java.util.Scanner;

public class FoorLoopSpeed {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end= scan.nextInt();

        if(start<end){
            for(int a=start; a<=end; a++){
                System.out.println(a+ ", ");
            }
        }else if(start>end){
            for(int a=start; a>=end; a--){
                System.out.println(a+ ", ");
            }
        }else{
            System.out.println("no action");
        }

    }
}
