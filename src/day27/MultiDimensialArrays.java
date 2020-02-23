package day27;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

public class MultiDimensialArrays {                     //Arrays.deepToString()==== this is for multidimensional. prints every arrays
    public static void main(String[] args) {

        int [][] arr2D={{1,2,3}, {4,5,6}};
        System.out.println(arr2D.length); // this tells you how many arrays are there

        System.out.println(Arrays.toString(arr2D[0]));    //this gives you arrays in array
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[0][2]);           //this print out numbers in array 1st one array, next number is number in array
        System.out.println(arr2D[1][1]);           //result is 5

        System.out.println(Arrays.toString(arr2D));  //you can not print. ARRAYStostring is applicable for 1 dimensional array

        System.out.println(Arrays.toString(arr2D[1])); //this print out one of the arrays in Array

        System.out.println(Arrays.deepToString(arr2D)); // this print out all in 1 array



    }
}
