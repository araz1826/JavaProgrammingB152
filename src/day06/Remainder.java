package day06;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {

        int min, hour;
        double remainder;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a minuter:");
        min = scan.nextInt();
        hour = min / 60;
        remainder = hour % 60;
        System.out.println(min + " minute is " + hour + " hour" + " and " + remainder + " min");
    }
}
