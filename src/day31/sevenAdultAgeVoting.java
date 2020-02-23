package day31;

public class sevenAdultAgeVoting {
    public static void main(String[] args) { //

        vote(15);
        vote(23);
        vote(36);

    }

    public static void vote(int age){     //above 18 is eligible to vote otherwise not
        //int age=19;        // you can not put this if you ad paramenters in() above
        if(age>=18){
            System.out.println("vote"+age);
        }else{
            System.out.println("not eligible");
        }
    }

}
