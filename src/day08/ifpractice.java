package day08;

public class ifpractice {

    public static void main(String[] args) {
        int currentspeed =90;


        if(currentspeed >60){
            System.out.println("you are speeding more than 70, point taken");

        }else if(currentspeed>70 & currentspeed<100){
            System.out.println(" warning");
        } else{
            System.out.println("keep driving");
        }

    }
}
