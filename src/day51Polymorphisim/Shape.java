package day51Polymorphisim;

public abstract class Shape {
    public abstract void draw();// abstract method does not have body

}

class Triangle extends Shape{
    @Override
    public void draw(){

        System.out.println("drawing triangle");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("drawing rectange");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){

        System.out.println("drawing circle");
    }
}