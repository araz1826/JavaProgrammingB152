package day37;

import java.util.ArrayList;
import java.util.List;

public class threeArrayLoop {
    public static void main(String[] args) {
                                            //create arraylist integer and fll it up with 1-100

        List<Integer> nums=new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            nums.add(i);

        }
        System.out.println(nums);

                                        // change all the ODD number to 0

        for (int i =0; i <100 ; i++) {
            if(nums.get(i)%2!=0){
                nums.set(i,0);
            }
        }
        System.out.println(nums);

                                    //insert 100 to 1st index, add new number
        nums.add(0,100);
        System.out.println(nums);


    }
}
