package day50;
//Final class: public static final field(CONSTANT): you can create object out of final class.

//Interface: no object create out of it. It is like a contract, final is in interface
// both Abstract and Interface method: does not have a body
//why we not constract for abstract class:  create it and give it child, sub class

public abstract class Shape implements Drawable {
    String name;
    double area;

    public Shape(String name){//why we need constructor in abstract class? beacuse we create to use in child, sub class

        this.name=name;
    }
    public abstract void calculateArea();

}
