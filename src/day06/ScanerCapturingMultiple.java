package day06;
import java.util.Scanner;
public class ScanerCapturingMultiple {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = blabla.nextLine();
        String another = blabla.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is :" + another);






    }
}
