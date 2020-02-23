package day39;

public class CarCall_5 {
    public static void main(String[] args) {
        Car_4 car1= new Car_4();
        car1.year=2019;
        car1.model="cls63";
        car1.make="Mercedes";
        car1.color="black";

        car1.goForward();// this is calling goForward method class fro Car_4
        car1.changeColor("blue");
        System.out.println(car1.year+car1.model+car1.make+car1.color);

        Car_4 car2=new Car_4();
        car2.year=2010;
        car2.model="accent";
        car2.make="hyundai";
        car2.color="blue";


        // change the car2 year to 2019
        car2.year=2019;
        // change to color of car1(car) to color of car2
        car2.color=car1.color;

        System.out.println(car2.year+car2.model+car2.make+car2.color);

        car1.carAge();
        car1.changeColor("blue");

    }
}
