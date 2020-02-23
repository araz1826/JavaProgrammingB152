package day50;

public class Square extends Shape{
    int length;

    public void calculateArea(){

        System.out.println("area:"+length*length);
    }
    public void draw(){

        System.out.println(" draw4 side"+length+Drawable.COLOR);
    }

    public Square(String name, int i) {
        super(name);
        this.length=length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
