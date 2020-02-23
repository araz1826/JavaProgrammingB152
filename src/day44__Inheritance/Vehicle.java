package day44__Inheritance;

public class Vehicle {  //super class
    protected String make; //PROTECTED access modifier: make tehe member accessible
                            //in sub class of the same class in different package
                        // different package but same sub class
    private int year;



     void start()
    {
        System.out.println("starting "+ make);
    }
    public void goForward(){

        System.out.println(make+ " is going forward");
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }
}
