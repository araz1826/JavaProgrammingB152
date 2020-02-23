package day42;

public class BikeAction2 {
    public static void main(String[] args) {

        Bike2 b1=new Bike2();
        Bike2 b2=new Bike2("abc");
        System.out.println("b1 gear: "+b1.gear);
        System.out.println("b2 gear:"+b2.gear);

        Bike2 b3=new Bike2(4);//newGear, u set 4 for newGear
        System.out.println("newGear: "+b3.gear);

        Bike2 b4=new Bike2(3,4);
        System.out.println(" gear and speed "+b4.gear+" "+b4.speed);



    }
}
