package day47Abstraction;

public class ElectricCar extends Car {

   int batteryLevel;

   @Override
    public  void start(){   // you have to override this method
        System.out.println("this is method");


    }
    @Override
    public void goForward(){
        System.out.println("go forward");

    }
    @Override
    public void goBackward(){
        System.out.println("bo backward");
    }
    @Override
    public void turn(String direction){
        System.out.println("direction:"+direction);

    }

    public static void main(String[] args) {
        ElectricCar e1= new ElectricCar();
        e1.start();
    }

}
