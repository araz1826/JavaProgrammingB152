package day63.CollectionSETandMAP;
                                       ////how many unique (NON-REPEATING) characher showed up in string
import java.util.HashSet;
import java.util.Set;

public class FindingUnique {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
        //how many unique characher showed up in string
        //Explanation:first find a data structure and remove dups,  iterate over each character,  then add it to the object(Hashset),
                           // it remove the dups automativally

        Set<Character> charset= new HashSet<>();  //for SET there is no order, just who instered first will be out first
        for (int i = 0; i <str.length() ; i++) {
            charset.add(str.charAt(i));
        }
        System.out.println("how many character: "+ str.length());
        System.out.println("How many unique char in charset = " + charset.size());
        System.out.println("charset: "+ charset);

        System.out.println("**********************************");
        for (Character each:charset) {
            System.out.print("unique chars: "+ each+" ");
        }


    }
}
