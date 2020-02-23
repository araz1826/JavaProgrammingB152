package day26;

import java.util.Arrays;

public class SwayWithoutTemp {
    public static void main(String[] args) {
     int [] nums={1,2,3,4,5,6,7}; // apply the same formula both for odd and even index

     int temp=nums[0];
     int k=nums.length-1;
     for(int a=0; a<nums.length/2; a++){
         nums[a]=nums[k];
         nums[k]=temp;
         k--;
         temp=nums[a+1];
     }
        System.out.println(Arrays.toString(nums));
    }
}

