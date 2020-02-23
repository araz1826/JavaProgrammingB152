package day45;

public class Earth extends Planet {  // you will et error

    //or super(); if you do not add constructor class in super class
    int population;

    //I want to create constructor to get evertying in 1 shot
   public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife); //"super" call all from SUPER class
        this.population = population;
    }

    //add toString method to print out all
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public static void main(String[] args) {

       Earth e1=new Earth(9.81,5000,true,10000);
        System.out.println("e1: "+e1);
    }
}
