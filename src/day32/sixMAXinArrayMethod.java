package day32;

public class sixMAXinArrayMethod {
    public static void main(String[] args) {
        printMaxInrArray(new int[] {1,2,3,4,5,6,7,8,9});
        printMinInrArray(new int []{1,2,3,4,5,6});
        sumofArray(new int []{1,2,3,4});
        moreThan60(new int [] {60,70,80,90});
        int []score={1,2,3,4,5,6};
        //or printMinInrArray(score);

    }
    public static void printMaxInrArray(int [] nums){       //max
        int max=nums[0];
        for(int a=0; a<nums.length; a++){
            if(nums[a]>max){
               max=nums[a];
            }
        }
        System.out.println(max);
    }
    public static void printMinInrArray(int [] nums){     //min
        int min=nums[0];
        for(int a=0; a<nums.length; a++){
            if(nums[a]<min){
                min=nums[a];
            }
        }
        System.out.println(min);
    }
    public static void sumofArray(int [] nums) {     //sum
        int sum = 0;
        for (int a = 0; a < nums.length; a++) {
                sum=sum+nums[a];
        }
        System.out.println(sum);
    }
    public static void moreThan60(int [] nums) {     //MORE THAN 60 IT IS IMPORTANT
        int count=0;
        for (int a = 0; a < nums.length; a++) {
            if(nums[a]>60){
            count++;
            }

        }
        if(count==nums.length){
            System.out.println("all passed");
        }else{
            System.out.println("someone failed");
        }
        }
}
