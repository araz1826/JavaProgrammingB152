package day37;

import java.util.*;

public class oneARRAYlistReverseandAll {                   //create AraayList and add team members, then print out
                                                            // regualar and Reverse order, then 2 name at a time(important)
    public static void main(String[] args) {
        // ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMate = new ArrayList<>();
        teamMate.add("Akbar");
        teamMate.add("Kuzzat");
        teamMate.add("Morodil");
        teamMate.add("Maruf");
        teamMate.add("Vasil");
        teamMate.add("Muhter");
        teamMate.add("Asiya");
        teamMate.add("Mike");
        teamMate.add("Guljannat");

        System.out.println("all team member in regular order");     //regular order
        for (int i = 0; i <teamMate.size() ; i++) {
            System.out.println("\tteam "+ (i+1)+" ="+teamMate.get(i));

        }
        System.out.println("Reverse order");                //reverse order
        for (int i = teamMate.size()-1; i >=0 ; i-- ) {
            System.out.println("\tteam "+ (i+1)+" ="+teamMate.get(i));

        }
        System.out.println("2 character have a time");       //2 at a time  Note:if you put i++, will repeat 1 same name
        for (int i = 0; i <teamMate.size()-2 ; i+=2) {
            System.out.println("\tteam "+ (i+1)+" ="+teamMate.get(i)+","+teamMate.get(i+1));

        }

        System.out.println("put them in order by DASH");    //No dash at the end
        String result="";
        for (int i = 0; i <teamMate.size()-1 ; i++) {   //you use size-1 to not get 1 last item  and add dash
            System.out.println("\tteam "+ (i+1)+" ="+teamMate.get(i)+","+teamMate.get(i+1));
            result+=teamMate.get(i)+"-";
        }
        System.out.println(result+teamMate.get(teamMate.size()-1));


                                        // how to turn a LIST into a STRING and store it...
                                            //and replace all comma with dash ,
        String lstToString= teamMate.toString();
        System.out.println(lstToString.replace(",", "-"));   //this is how to convert to STRING

        System.out.println(lstToString.replace("[","")      //You can use 2-3 and more REPLACE in 1 sout and
                                        .replace("]",""));     // and.. remove [ from previous sout
    }
}
