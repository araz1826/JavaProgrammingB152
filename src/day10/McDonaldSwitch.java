package day10;

public class McDonaldSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome toMcDonald, what can I get for you:");
        int number = 3;
        String order = "";

        switch (number){
            case 1:
                System.out.println("you have selected 1");
                order = "Burger";
                break;
            case 2:
                System.out.println("you have selected 2");
                order = "nugget";
                break;
            case 3:
                System.out.println("you have selected 3");
                order = "Ice cream";
                break;

            case 4:
                System.out.println("you have selected 1");
                order = "Soda";
                break;
            default:
                System.out.println("this is not a right choice");

        }
        System.out.println(" your choice is " + order);
    }
}
