package day29;

import java.util.Arrays;

public class fourStringArray {
    public static void main(String[] args) {
        String hero1="Superman-Clark Kent";  // print out like this: Hero code is Superman and identity is Cark kent
                                            // initial of the hero is CK
        String [] newHero= hero1.split("-");
        System.out.println(Arrays.toString(newHero));

        System.out.println("Hero code is "+ newHero[0]+" and identity is "+ newHero[1]);
        System.out.println("The inital is CK");

        String heroCode=newHero[0];  //This is how you store heronames in code
        String fullName=newHero[1];

        String[] initial= fullName.split(" ");
        System.out.println(Arrays.toString(initial));

        String first=initial[0];                             //how to add initials
        String last= initial[1];
        System.out.println("initials are: "+first.charAt(0)+ last.charAt(0));


        System.out.println("initial name is "+ initial[0].charAt(0)+initial[1].charAt(0)); // how to add initial, different method



        }

    }

