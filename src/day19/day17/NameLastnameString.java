package day19.day17;

import java.util.Scanner;

public class NameLastnameString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String  name=scan.nextLine();
        int len= name.length();
        int ind= name.indexOf(" ");
        int ind2= ind+1;
        int ind3= ind2+1;
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1,ind).toLowerCase() + " " +
                name.substring(ind2,ind3).toUpperCase() + name.substring(ind3).toLowerCase());
    }
}
