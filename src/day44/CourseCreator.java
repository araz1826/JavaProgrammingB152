package day44;

public class CourseCreator {
    public static void main(String[] args) {

        //yhis is how u call static
        System.out.println("Course counter: "+Course.counter);


        Course c1=new Course("java", "foundation");
        System.out.println("Course counter: "+c1.counter);

        Course c2=new Course("oracle", "database");

        //this counts the how many name and type above
        System.out.println("Course counter: "+c1.counter);
        System.out.println("Course counter: "+Course.counter);

    }
}
