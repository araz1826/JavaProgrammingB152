package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("are you recording? ");
        boolean isRecording = input.nextBoolean();
        System.out.println("we are recording: " + isRecording);
    }
}
