package day42;

public class Action1 {
    public static void main(String[] args) {

        Computer1 c1=new Computer1();

        c1.setBrand("apple");
        System.out.println(c1.getBrand());
        c1.setPrice(1000);
        System.out.println(c1.getPrice());
        c1.setRam(56);
        System.out.println(c1.getRam());

        System.out.println(c1.toString());
        c1.setPrice(500);//this is how you change price

        System.out.println(c1.toString());

        //store my ram
        int myRam=c1.getRam();
        System.out.println("myRam = " + myRam);

        Computer1 c2 =new Computer1();
        c2.setBrand("HP");
        c2.setPrice(c1.getPrice()/2); //set HP half of apple price
    c2.setRam(myRam/4); //set HP ram to 1/4 of apple ram
        System.out.println(c2.toString());


    }

}
