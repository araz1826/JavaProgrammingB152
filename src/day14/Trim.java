package day14;

public class Trim {
    public static void main(String[] args) {
        String message = "         ";

        System.out.println(message.length());
        message = message.trim();
        System.out.println(message.length());
        System.out.println(message.isEmpty());
    }
}
