package day31;

import javax.swing.text.DefaultEditorKit;

public class eightSeasonChecker {
    public static void main(String[] args) {
            String myseason="AAA";

          decideSeasonAction("winter");
            decideSeasonAction(myseason);  //you can not put this in, will be invalid data,  because it does not find in switch statement

    }
    public static void decideSeasonAction(String season){

        switch (season){
            case "winter":{
                System.out.println(" snow "+season);
                break;
            }
            case "spring":{
                System.out.println(" rain "+season);
                break;
            }
            case "summer":{
                System.out.println(" fruit "+season);
                break;
            }
            case "fall":{
                System.out.println("yellow leaves "+season);
                break;
            }
            default:
                System.out.println("invalid season");
        }
    }
}
