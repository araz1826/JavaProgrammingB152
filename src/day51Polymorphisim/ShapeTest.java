package day51Polymorphisim;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1=new Triangle(); // we created super type as referance type
        Shape s2=new Rectangle();
        Shape s3=new Circle();

       s1.draw();
       s2.draw();
       s3.draw();

       // create Array of shape to store
// 5 concrete Shape Object
// and call the draw the method on each of them
// Also try to create ArrayList of Shape
// and store 4 concrete Shape objects
// and call the draw method on each of them
  // Create a different class with main method:
// and try to use the Shape, Circle, Triangle class from day 50
// Create list of Shape and calculate their area

       Shape [] allShapes={s1,s2,s3, new Triangle(), s2};

        for (Shape item: allShapes) {
            item.draw();

        }
        for (int i = 0; i <allShapes.length ; i++) {// this is with fori same thing
            allShapes[i].draw();

        }

        List<Shape> lst=Arrays.asList(s1,s2,s3,s2,s1);
        for (Shape each:lst) {
            each.draw();

        }
        for (int i = 0; i <lst.size() ; i++) {
            lst.get(i).draw();

        }
    }
}
