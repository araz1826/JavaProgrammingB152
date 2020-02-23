package day56MIX_TASK;

import java.util.Arrays;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 =new Product("MACBOOK", 1999);
        System.out.println(p1.toString());
        Product p2 =new Product("SONY", 399);
        Product p3 =new Product("SONY", 399);

        System.out.println(p1==p2);
        System.out.println(p2==p3);
        System.out.println(p2.equals(p3));//how to check .equal method of object
                        // it compares not inside, it does ar they the same object, 1 is p2 and other is p3

        System.out.println("p1 equals p1 "+p1.equals(p1));

        Product p4=p3;
        System.out.println("p4 eqauls p3: "+p4.equals(p3));
    }
}
