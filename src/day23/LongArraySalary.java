package day23;

import java.util.Arrays;

public class LongArraySalary {
    public static void main(String[] args) {
        long[] salary={4000,5000,6000,7000,12000};
        Arrays.sort(salary);
        int sum=0;
        for(long item: salary){
            System.out.println("each salary: "+item);



            if(item>10000)
                System.out.println(item);

        }
        for(int a=0; a<salary.length;a++){
            sum+=salary[a];


        }
        System.out.println("max:"+salary[salary.length-1]);
        System.out.println("sum:"+sum);
    }
}
