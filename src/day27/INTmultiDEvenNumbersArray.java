package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class INTmultiDEvenNumbersArray {                        //Requirements are. print all even numbers with contiue method
    public static void main(String[] args) {                        //
        int [][] ages ={{10},{12,13,14,16,17},{19,20,21,22,23}};
        for(int a= 0; a<ages.length; a++){
            for(int b=0; b<ages[a].length; b++){
                if(ages[a][b]%2!=0){                   // or if(ages[a][b]%2==0)  System.out.print(ages[a][b]+" ");

                    continue;

                }
                System.out.print(ages[a][b]+" ");
            }



        }

    }
}
