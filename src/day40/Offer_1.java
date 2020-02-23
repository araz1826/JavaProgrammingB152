package day40;

import javax.print.DocFlavor;

public class Offer_1 {              //add one behavior to below info and print out
    String location;
    String company;
    long salary;                        //NOTE: you only create a template here
    boolean isFulltime;

    public void displayInformation() {   //it is a instance method to print out offer object. under instance method
                                                                //you can access to instance variable.
        System.out.println("location:"+location+ " company: "+company+ " salary: "+ salary+" isFulltime:"+isFulltime);
    }
    //write a method called turnToFulltime  find non full time
    public void turnToFulltime(){
        if(isFulltime==false){
            isFulltime=true;
        }else{
            System.out.println("already full time");
        }

    }
    //write a method to change the loction of the Offer
    public void changeLocation(String newLocation){
        location=newLocation;

    }
    //write a method to accept 4 parameters to change all info
    public void changeAllInfo(String newCompany,String newLocation,long newsalary,boolean newfulltime){
        company=newCompany;
        location=newLocation;
        salary=newsalary;
        isFulltime=newfulltime;
    }
    //write a method to return the value check the offer belong to 100K club.
                //if more than 100k true, if not false
    public boolean is100koffer(){

        return salary>100000;
    }

    //create an instance method called toString ,return String representation
    //of Offer Object in below format
    // Location: Virginia, Company=amazon, salary=150000$, isfulltime=true
    public String toString(){
        return "location:"+location+ " company: "+company+ " salary: "+ salary+" isFulltime:"+isFulltime;
    }

}
