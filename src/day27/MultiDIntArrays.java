package day27;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class MultiDIntArrays {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<numbers.length; i++){
            System.out.println(Arrays.toString(numbers[i])); // this prints each array in big array
            System.out.println("======================");
        }
        for(int i=0; i<numbers.length; i++) {         // how to print out all number in array, but not as Stringarray
            for(int j=0; j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");      //first [] is array, second is each element of array
            }
        }


    }
}
