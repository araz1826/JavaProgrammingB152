package day08;
import java.util.Scanner;
public class Warmup {
    public static void main(String[] args) {
        int age;
        System.out.println("please enter your age");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();

        if(age >= 18){
            System.out.println("you are ready to drive");

        } else{
            if(age<18 && age > 16){
                System.out.println("you can drive with your dad");
            } else {
                System.out.println("you are too young:))");
            }

        }
    }
}
