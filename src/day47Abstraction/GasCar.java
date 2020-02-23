package day47Abstraction;

public class GasCar extends Car{ // you have to add abstract

    //create another sub class of CAR called gasCar
    // add a field called gaslevel
    //implement all the abstract method of Car class

    //create a GasCar object here
    //call all the methods to test

    int  gasLevel;


        @Override
        public void start() {
            System.out.println("car starts");
        }

        @Override
        public void goForward() {
            System.out.println("car goes forward");
        }

        @Override
        public void goBackward() {
            System.out.println("car go back");
        }

        @Override
        public void turn(String direction) {
            System.out.println("direction"+direction);
        }
    }






