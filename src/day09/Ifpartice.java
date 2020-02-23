package day09;
import java.util.Scanner;
public class Ifpartice {
    public static void main(String[] args) {
        String go;
        int speed;
        System.out.println("Please enter your speed limit");
        Scanner scan = new Scanner(System.in);
        speed = scan.nextInt();

        if(speed >60){
            go ="stop";

        }else{
            go = "go";
        }
        System.out.println("please drive safe " +go);
    }
}
