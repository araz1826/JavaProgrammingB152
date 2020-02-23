package day26;

import java.util.Arrays;

public class secondMaxofArraymyselfTask {
    public static void main(String[] args) {

        int[] nums={3,2,1,4,5,7,6}; //Write a program that can find the second max number from an int array

        int max=-nums[0];
        for(int a=0; a<nums.length;a++){
            if(nums[a]>max){
                max=nums[a];


            }
        }
        System.out.println(max);
        //Arrays.sort(nums);
        //System.out.println(nums[nums.length-2]);   to sort in arrays and then print out the 2nd value.

    }
}

