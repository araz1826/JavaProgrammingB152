package day59.Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        String name="araz";

        NullPointerException e1=new NullPointerException();  //you create an object

        NullPointerException e2=new NullPointerException("abc mesage");// you create an object and PASS MESSAGE
        System.out.println(e2.getMessage());  // this is how you called the method inside
    }
}
