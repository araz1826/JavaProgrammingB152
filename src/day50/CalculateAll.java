package day50;

public class CalculateAll {
    public static void main(String[] args) {
        //everything is under square, let
           //call from square
        Square s1= new Square("yumru", 12);

        System.out.println("s1 withou area calculation :"+s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation"+s1);
        s1.draw();

        Circle c1= new Circle("yumr2", 3);
        c1.calculateArea();
        c1.draw();
        System.out.println(c1);

    }

}
