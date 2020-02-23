package day33;

public class threeConvertNumberToDay {
    public static void main(String[] args) {
        System.out.println(convertNumberToDay(3));

    }
    public static String convertNumberToDay(int dayCode){   //Another method to solve the day of the week.
        switch(dayCode){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "FUNDAY!";
        }
    }
    public static void add(int a, int b){
        int num=a+b;
        if(num>10){
            return;   //return means also, get out. if num is not greater than 10 GET OUT
        }
        System.out.println("happy year");
    }
}