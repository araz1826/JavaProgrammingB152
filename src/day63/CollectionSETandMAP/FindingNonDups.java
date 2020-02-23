package day63.CollectionSETandMAP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;               //Coverting Arrays to SET and fidn the unique chars

public class FindingNonDups {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        String [] splitter= str.split("");//this will print out all chars
        System.out.println(Arrays.toString(splitter));
        //now trun this to LIST
        List<String> charlst=Arrays.asList(splitter);
        System.out.println(charlst);
        //then turn into HashSet
        Set<String> charset=new HashSet<>(charlst);
        System.out.println(charset);

        System.out.println("****************************************");
        Set<String> chrset=new HashSet<>(Arrays.asList(str.split(""))); //1 shot
        System.out.println(chrset);


    }
}
