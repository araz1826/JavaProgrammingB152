package day11;

import java.util.Scanner;

public class SwitchScanner {
    public static void main(String[] args) {
        String targertOption = "";
        Scanner scan = new Scanner(System.in);
        targertOption = scan.nextLine();
        switch(targertOption){
            case "Bd":
                System.out.println(" you have turned on bedroom light");
                break;
            case "Lr":
                System.out.println(" you have turned on Livingroom light");
                break;
            case "Ki":
                System.out.println(" you have turned on Kitchen light");
                break;
            case "Ha":
                System.out.println(" you have turned on Hallway light");
                break;
            default:
                System.out.println("There is no such a light");

        }

    }
}
