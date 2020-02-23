package day15;

public class Replace {
    public static void main(String[] args) {
        String message = "I love Pumkin, Pumkin IS FUN";
        message =message.replace("Pumkin", "Java");
        System.out.println(message);
        String name = " Happy Thanks Giving to All";
        // want to have HappyThanks
        name = name.replace("Thanks Giving", "Thanksgiving");
        System.out.println(name);


    }
}
