package day05;
import java.util.Scanner;

public class PrintScanner {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("please enter your name: ");
        String userName = info.nextLine();
        System.out.println("your name is: " + userName);

        System.out.println("Please enter your birthYear:");
        int birth = info.nextInt();
        int age = 2019 - birth;
        System.out.println("your age is: " + age);

        System.out.println("please enter your height");
        double height = info.nextDouble();
        System.out.println("your height is: " + height);


    }
}
