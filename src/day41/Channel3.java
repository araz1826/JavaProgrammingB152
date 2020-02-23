package day41;

public class Channel3 {
    public static void main(String[] args) {
        Product3 p1=new Product3();

        p1.setName("melon");
        System.out.println(p1.getName());

        p1.setPrice(45.4);
        System.out.println(p1.getPrice());

        //store the price
        double price1=p1.getPrice();
        System.out.println(price1);

        System.out.println(p1);


    }
}
