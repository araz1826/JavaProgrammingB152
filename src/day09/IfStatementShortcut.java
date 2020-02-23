package day09;

public class IfStatementShortcut {
    public static void main(String[] args) {
        int day =3;
        String name ;

        if(day == 1){
            name = "Monday";
        }else if (day ==2) {
            name = "tuesday";
        }else if (day ==3) {
            name = "wednesday";
        } else if (day ==4) {
            name = "thursday";
        } else {
            name = "unknown";
        }
        System.out.println("today is " + name);
    }
}
