package day39;

public class Car_4 {     //Create a Car Object template by creating a Car class
                                                    //it  has these attributes
                                                            // year , model , make , color
    int year;
    String model;
    String make;
    String color;

    public void goForward(){
        System.out.println(make+":Going forward");

    } //create a instance method to get the car age
    public void carAge(){
        System.out.println("car age:" +(2020-year));
    }
    //create a method change color to newcolor
    public void changeColor( String newcolor){
        color=newcolor;

    }
}
