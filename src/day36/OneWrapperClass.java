package day36;

public class OneWrapperClass {
    public static void main(String[] args) {

        //sum(12,13); // this is used for when you add int value
        sum(new Integer(14), new Integer(45));
        sum(Integer.valueOf(23), Integer.valueOf(45));    //you can use these 2 methods

        doubleTheValue(3);
        doubleTheValue(new Integer(12)); // WHY it cappect INTEGER object?:it is auto unboxing, complier automatically do that

        add1Hundred(25);
    }
    public static void sum(Integer num1, Integer num2){    //add 2 Integer and print
        Integer sumof= num1+num2;
        System.out.println(sumof);

        // OR System.out.println(num1+num2);
    }
    public static void doubleTheValue(int x){  //double the number
        System.out.println(x*2);
    }

    public static void add1Hundred(int x){
        System.out.println(x+100);
    }
}
