package day23;

import java.util.Arrays;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] num =new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        int sum=0;
        int max=num.length-1;
        int min=num.length-5;
        Arrays.sort(num);
        int average=0;
        int dbl=0;

        for(int a=0; a<5; a++){
            System.out.println(num[a]*2);
            sum=sum+num[a];
            average=sum/max;


        }
        System.out.println();
        System.out.println(sum);
        System.out.println(num[max]);
        System.out.println(num[min]);
        System.out.println(average);
        System.out.println(num[0]);//first value if it is not in order

    }
}
