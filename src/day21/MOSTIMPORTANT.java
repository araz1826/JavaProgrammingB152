package day21;

import java.util.Scanner;

public class MOSTIMPORTANT {
    public static void main(String[] args) {
      String myName="arazismayilovaraz";
      int count=0;
            for (int i = 0; i <myName.length()-2 ; i++) {
                String currentName=myName.substring(i,i+3);
                if(currentName.equalsIgnoreCase("ara")){
                    System.out.println("Index Of A: "+i);
                    count++;
                }
            }
        System.out.println(count);
    }
}
