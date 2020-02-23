package day05;
import java.util.Scanner;

public class HourlySalaryScanner {
    public static void main(String[] args){

        Scanner info = new Scanner(System.in);
        System.out.println("Please enter your hourly salary");
        double wage = info.nextDouble();
        double year = (8 * wage * 22 * 12);
        System.out.println(year);

    }
}
