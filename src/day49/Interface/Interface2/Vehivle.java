package day49.Interface.Interface2;

abstract class Vehicle {
    int year;

    public abstract void start();

    public void goForward(){
        System.out.println("go forward");

    }

    public Vehicle(int year) {

        this.year = year;
    }
}
