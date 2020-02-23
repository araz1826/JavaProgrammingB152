package day47Abstraction;

// you can not create any object for abstract class.
//abstract class does not need body : public abstract void eat();
//for abstract method you need a abstract class
/// if you creat abstract at super class, you have to override the same method in sub class that the method u have uin super class
// an abstract class can not be instantiated

//goal is provide resusable variable and methods to sub class

//there is ony abstract class and method

//abstract class meant to be only super class
// reusable fields andmethods for subclass

//it is a place holder for sub classes
//concrete class is a actula sub class of super abstract class

public abstract class Car {  //abstract class ,

    int year;
    String brand;

  public abstract void start(); //abstract method

    //create 3 method  goforward gobackward and turn(String direction)

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);


}
