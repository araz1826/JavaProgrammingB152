package day12;

public class WarmupSeasonFinder {
    public static void main(String[] args) {
        int month = 34;

        if (month<1 || month >12){
            System.out.println("Invalid month");
        }else if(month>=3 && month<=5){
            System.out.println("It is spring");
        }else if (month>= 6 && month<=8 ){
            System.out.println("It is summer");
        }else if (month>= 9 && month<=11 ) {
            System.out.println("It is fall");
        }else if (month==12 || month==2 || month==1 ) {
            System.out.println("Winter");
        }else{
            System.out.println("invalid number");
        }

        }
}
