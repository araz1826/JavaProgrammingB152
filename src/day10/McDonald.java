package day10;

public class McDonald {
    public static void main(String[] args) {
        System.out.println("Welcome toMcDonald, what can I get for you:");
        int number = 35;
        String order = "";
        
        if (number ==11){
            System.out.println("you have selected 1");
            order = "Burger";
        } else if (number ==5){
            System.out.println("you have selected 1");
            order = "French fries";
        } else if (number ==8) {
            System.out.println("you have selected 1");
            order = "Nuggets";
        } else if (number ==35) {
            System.out.println("you have selected 1");
            order = "Ice Cream";
        } else{
            System.out.println(" Unknown value");
        }
        System.out.println(order);
    }
}
