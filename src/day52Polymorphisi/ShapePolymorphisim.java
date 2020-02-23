package day52Polymorphisi;

public class ShapePolymorphisim {
    public static void main(String[] args) {

       Drawable s1=new Circle("penny",5);
        //Shape s2=new Circle("penny",5);
       // Circle s=new Circle("penny",5);

       s1.draw();  //only give you hat Drawable has

        Circle c1= new Circle("dime",4);
        System.out.println(c1.toString());// anything that Circle has +drawable

        Object o1=new Circle("penny",4);  // this is the Object class and have nothing, it is not obvious
        //o1. there is nothing you can add

        Circle s4=new Circle("penny", 5);
        printAnyShape(s4);

        Rectangle r1=new Rectangle("dort",3,4);
        printAnyShape(r1);

        drawShape3Times(r1);
        drawShape3Times(s4);
        drawShape3Times(c1);
        drawShape3Times(new Square("dort",4));

    }
            //create a method that accept  any shape  and print out the calculated ares
    //lets create a static method to make it under main method
            public static void printAnyShape(Shape anyShape){  //this is a method to calculate the area of each figure

        anyShape.calculateArea();
        System.out.println(anyShape.name+"  "+anyShape.area);   //since you called above anyrshape.area under circle will get the area from circle
            //since can be many anyshape.are above, we need to create an name+ area



    }
    public static void drawShape3Times(Shape anyShape){
       anyShape.draw();
       anyShape.draw();
       anyShape.draw();
        System.out.println();

    }
}
