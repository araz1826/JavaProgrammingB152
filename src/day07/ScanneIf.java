package day07;
import java.util.Scanner;
public class ScanneIf {
    public static void main(String[] args) {
        String password = "araz";
        System.out.println("guess your password");

        Scanner guess = new Scanner(System.in);
        String type = guess.nextLine();

        if(type.equals(password)) {
            System.out.println("correct");
        } else {
            System.out.println("Not correct");
        }
    }
}
