package day26;

import java.util.Scanner;

public class UniqueValueofString {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    String[] numbers={"a","a","b","c","c"}; // how to find unique value of string
    String c=numbers[0];
    for(int a=0; a<numbers.length; a++){
        int count=0;
        for(int b=0; b<numbers.length; b++){
            if(numbers[a].equalsIgnoreCase(numbers[b])){
                count++;
            }
        }
        if(count==1){
            c=numbers[a];
        }
    }
        System.out.println(c);

    }

}

//2. Write a program that can print out the unique values from  String Array
//        Ex:
//            if arr -> {"a" , "a ", "b", "c", "c"}
//                output: b*/
