package day37;
import java.util.ArrayList;
public class fiveArralLength {
    public static void main(String[] args) {         //find the longest name and if there are some same name get the last one
        ArrayList<String>name=new ArrayList<String>();
        name.add("Rukhshona");
        name.add("Farzona");
        name.add("Aziza");
        name.add("Mahliyyoh");
        name.add("Ulugbek");
        name.add("Olim");
        name.add("Inobat");

        int longest=name.get(0).length();
        String longestname=name.get(0);

        for (int i = 0; i <name.size() ; i++) {
            if(name.get(i).length()>longest){
                longest=name.get(i).length();
                longestname=name.get(i);
            }
        }
        System.out.println(longestname);

        System.out.println("******************");

        for (int i = 0; i <name.size() ; i++) {                   //how to print all same lenght name
            if(name.get(i).length()==longestname.length()){
                System.out.println(name.get(i));
            }
        }
                                                    // if you want to get the same length but the very last one. only change is x>=
        System.out.println("**********************");

        for (int i = 0; i <name.size() ; i++) {
            if(name.get(i).length()>=longest){
                longest=name.get(i).length();
                longestname=name.get(i);
            }
        }
        System.out.println(longestname);
    }
}
