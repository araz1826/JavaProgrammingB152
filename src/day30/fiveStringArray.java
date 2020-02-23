package day30;

import java.util.Arrays;

public class fiveStringArray {
    public static void main(String[] args) {
        String sentence ="I love Java Java Java";
        String[] splitter= sentence.split(" ",1); // 1 mean no comma sign, just a 1 whole sentence
        String[] splitterd= sentence.split(" ",2);// this give me array in 2 pieces  yani vergul 2 ye ayiracaq
        System.out.println(Arrays.toString(splitter));
        System.out.println(Arrays.toString(splitterd));


        String name="Mazda-cx-5";

        String[] split=name.split("-",2);
        System.out.println(Arrays.toString(split));
        String[] split2=name.split("-",3);
        System.out.println(Arrays.toString(split2));
    }
}
