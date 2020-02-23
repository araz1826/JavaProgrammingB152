package day06;
import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);

        double regularPrice = 80d;
        double discoutPercantge = 0.2d;
        double sales = regularPrice - (regularPrice * discoutPercantge);

        System.out.println("Please enter the regular Price: ");
        regularPrice = info.nextDouble();


        System.out.println("Please enter your Discout rate");
        discoutPercantge = info.nextDouble();

        System.out.println("Regular price is " + regularPrice + " ,"
                + "discount is " + discoutPercantge + " and you got deal for " + sales);




    }
}
