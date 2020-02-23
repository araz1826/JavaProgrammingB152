package day45;

public class Planet {
    double gravity;
    int radius;
    boolean hasLife;

    //at least add constructor to avoid the error in advance
    //otherwise will give error when you extend  or add super() under eart class
    public Planet(){

    }
    public Planet(double gravity, int radius, boolean hasLife) {
        this.gravity = gravity;
        this.radius = radius;
        this.hasLife = hasLife;
        System.out.println("CRAZY CHANGE");
    }
}
