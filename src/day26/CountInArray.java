package day26;

import java.util.Arrays;

public class CountInArray {
    public static void main(String[] args) {
        String[] marvelHeros= {"Iron Man", "Captain America","Spiderman",
                "Black Panter", "Hulk", "BalckWidow","Wanda","Captain Marvel", "Captain America","Spiderman","BalckWidow","Wanda","Captain Marvel", "Captain America", };

        System.out.println("marvel heros:"+ Arrays.toString( marvelHeros)); //print all string in array
        System.out.println("count of numbers:"+ marvelHeros.length );  //how many item in array

        int count=0;                          // counting "iron man"
        for( String item:marvelHeros){
            if(item=="Iron Man"){   // item.equalsIgnoreCase("iron man")
                count++;
            }
        }
        System.out.println("count of Iron man: " +count);


    }
}
