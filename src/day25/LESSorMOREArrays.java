package day25;

public class LESSorMOREArrays {
    public static void main(String[] args) {

        int[] nums = {13, 31, 8, 4, 5, 3, 1};

        for(int a=0;a<nums.length;a++ ){
            if(nums[a]>nums[a+1]){
                System.out.println("not sorted");  //trying to find if it is not sorted
                break;

            }
        }

    }
    }



