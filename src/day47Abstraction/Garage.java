package day47Abstraction;

public class Garage {
    public static void main(String[] args) {

        //Car c1=new Car(); you can not do this for Abstract class
               //can not be instantated: means can not create an object out of it

ElectricCar c1= new ElectricCar();
c1.start();
c1.goForward();
c1.goBackward();
c1.turn("right");

//create another sub class of CAR called gasCar

        GasCar g1= new GasCar();
        g1.start();
        g1.goBackward();
        g1.goForward();
        g1.turn("lest");
    }

}
