package day36;

public class fourSWAPvalue {
    public static void main(String[] args) {  //swap the first and last value of long array

        swapFirstLastValue(new long[]{1,2,3,4,5});

    }
    public static void swapFirstLastValue( long[] nums) {

        long temp = nums[0];

        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;


                                         //note: [null, null, null] it means nothing  and this is for string ex: Long
    }                                   //note: [0,0,0] it means nothing  and this is for primitive type ex: long
}
