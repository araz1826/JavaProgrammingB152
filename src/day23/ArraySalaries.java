package day23;

import java.util.Arrays;

public class ArraySalaries {
    public static void main(String[] args) {
        long[] salary={4000,5000,6000,7000,12000};
int count=0;

        for(long item: salary) {
            if (item<6500){
                continue;
            }
            System.out.println(item);
            count++;

        }
        System.out.println(count);
    }
}
