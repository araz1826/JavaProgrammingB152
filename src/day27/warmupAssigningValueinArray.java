package day27;

import java.util.Arrays;

public class warmupAssigningValueinArray {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60};

        int num1=num[num.length-1]; //to get last number in array
        System.out.println(num1);

        for(int item: num){
            System.out.print(item+ " "); // print out each number with space
        }
        System.out.println();
        System.out.println(Arrays.toString(num)); // print in array

    }
}
