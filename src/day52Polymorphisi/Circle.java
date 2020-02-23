package day52Polymorphisi;

public class Circle extends Shape {

    double radious;
    public void calculateArea(){

        System.out.println("area"+3.14*radious*radious);
    }

    public Circle(String name, double radious) {
        super(name);
        this.radious = radious;
    }
    public void draw(){
        System.out.println("draw circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
