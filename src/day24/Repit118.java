package day24;

import java.lang.reflect.Array;
import java.util.*;

public class Repit118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int c=nums[0];
        for(int a=0; a<7; a++){
            int k=0;
            for(int b=0; b<7; b++){
                if(nums[a]==nums[b]){
                    k++;
                }
            }
            if(k==1){
                c= nums[a];

            }
        }
        System.out.println(c);
    }


    }