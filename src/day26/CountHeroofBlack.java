package day26;

import java.util.Arrays;

public class CountHeroofBlack {
    public static void main(String[] args) {

        //black the Heros with the name contains BLACK

        String[] marvelHeros= {"Iron Man", "Captain America","Spiderman",
                "BlackPanter", "Hulk", "Black Widow","Wanda","Captain Marvel", "Captain America","Spiderman","Black Widow","Wanda","Captain Marvel", "Captain America", };

        System.out.println(Arrays.toString(marvelHeros));

        int count=0;
        for(String item: marvelHeros){
            if(item.toLowerCase().contains("black")){     //how to convert to lowercase
                count++;
            }
        }
        System.out.println(count);





        }
    }

