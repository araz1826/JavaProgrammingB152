package day55.Exception;  //IMPORTANT NOTES:
//INTERFACE:  NO instance method, NO instance variable
            //No constructor because constructor is created out of class this is not a class.
            // PUBLIC, STATIC, FINAL, can NOT be Private, because you will not able to call it
            // when you create a method, can be or not be a ABstract keyword. both works

//ABSTRACT: has to be PUBLIC, becase meant to be override

//THIS vs SUPER: this calls only instance variable but super calls both instance var and method

public class ReviewOOP {

    public ReviewOOP(){     //super is always first line of the constructor
                                //this and super can not be called together, either one
     this(100); // this means calling int from next constructor
        System.out.println("no arg constructor"); // any constructor for the first line must me no argument
                                                //this is THIS constructor

    }
    public ReviewOOP(int x){

       // this();
        System.out.println(" 1 arg constructor"+x);
    }

    public static void main(String[] args) {
        ReviewOOP r=new ReviewOOP( 100);

    }

}
