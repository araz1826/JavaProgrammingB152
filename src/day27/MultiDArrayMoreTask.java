package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDArrayMoreTask {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6}};   //2D array

        int[][][] arr3D={{{1,2,3},{4,5,6}},  {{7,8,9},{10,11,12}}  };

        //print out 9 out of array
        System.out.println(arr3D[1][0][2]);
        //print out 2;
        System.out.println(arr3D[0][0][1]);

        System.out.println(Arrays.toString(arr3D[0][0]));                                    // 1 array out

        System.out.println(Arrays.toString(arr3D[1][1]));                                     // 1 array out

        System.out.println(Arrays.deepToString(arr3D[1]));                              // 2 array together==DEEP array

        System.out.println(Arrays.deepToString(arr3D));                                // prints all array

        System.out.println(Arrays.toString(arr3D[0][1])+ ","+Arrays.toString(arr3D[1][0]));
    }
}
