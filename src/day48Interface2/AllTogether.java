package day48Interface2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTogether {
    public static void main(String[] args) {
       Kangroo k1=new Kangroo("KAN",13);
       k1.CarryChildinThePocket();
        System.out.println(k1);
        k1.bounce();

        Ball b1=new Ball("circle","blue");
        System.out.println(b1);

        System.out.println(Bouncable.GRAVITY);

        //Important
        Bouncable b3=new Kangroo("Round", 6);

        int[] list=new int[]{1,2,3,4,5,6};
        int [] arr1=new int[list.length/2];
        for (int i = 0; i <list.length/2; i++) {
           arr1[i]=list[i]+list[i+(list.length/2+1)];
        }
        System.out.println(Arrays.toString(arr1));

    }

}
