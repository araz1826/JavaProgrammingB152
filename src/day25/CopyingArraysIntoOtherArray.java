package day25;

import java.util.Arrays;

public class CopyingArraysIntoOtherArray {
    public static void main(String[] args) {
        int [] nums={13,31,8,5,21,2};

        //copying nums into other Arrays

        System.out.println("nums: "+ Arrays.toString(nums));

        int [] numsCopy= new int[nums.length]; // that gives you how much number in previous array
        numsCopy[0]=nums[0];
        numsCopy[1]=nums[1];
        numsCopy[2]=nums[2];
        numsCopy[3]=nums[3];
        numsCopy[4]=nums[4];
        numsCopy[5]=nums[5];


        System.out.println("numsCopy:"+ Arrays.toString(numsCopy));

        for(int x=0; x<nums.length; x++) {
            numsCopy[x]=nums[x];
        }
        System.out.println(Arrays.toString(numsCopy)); //before sort
        Arrays.sort(numsCopy);
        System.out.println(Arrays.toString(numsCopy)); //after sort
        if(Arrays.equals(nums,numsCopy)){  //to make sure that it is already sorted or not
            System.out.println("already sorted");
        }else{
            System.out.println("is not sorted");
        }
    }
}
