package day25;

public class Warmup {
    public static void main(String[] args) {
        int[] nums = {11, 31, 58, 4, 95, 2013,199901};

        for(int a=0; a<nums.length-1; a++){
            if(nums[a]>nums[a+1]){  //or !num[]<nums[]
                System.out.println(


                        "not sorted");
                break;
            }
        }

    }
}
