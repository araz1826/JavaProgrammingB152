package day35.DoubleParseValue;

import java.lang.reflect.Array;

public class threeWrapper {
    public static void main(String[] args) {
        String sentence ="I bought 3 tomatoes and the price was 3.14 each"; // how much is final tomato purchase, count is 3rd word.
                                                                            // price is always before the each
        String[] splitter=sentence.split(" ");
        String count=splitter[2];
        int count1=Integer.parseInt(count);
        System.out.println(count1);
        float price= Float.parseFloat(splitter[splitter.length-2]);
        System.out.println(price);
        float total=count1*price;
        System.out.println(total);

        //or short way is

        int count2=Integer.parseInt(sentence.split(" ")[2]);
        float count3=Float.parseFloat(sentence.split(" ")[sentence.split(" ").length-2]);
        System.out.println(count2*count3);

        //or 1 shot
        System.out.println(Integer.parseInt(sentence.split(" ")[2])*Float.parseFloat(sentence.split(" ")[sentence.split(" ").length-2]));

        // last element of any array
        System.out.println(sentence.split(" ")[sentence.split(" ").length-1]);


    }
}
