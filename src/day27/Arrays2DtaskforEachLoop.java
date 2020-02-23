package day27;

import java.util.Arrays;

public class Arrays2DtaskforEachLoop {
    public static void main(String[] args) {                     // for each loop method
        int [][] arr2D={{10,20,30},{40,50,60,60,80,90,100}};

        for(int [] each1DArray: arr2D){
                             //System.out.println(Arrays.toString(each1DArray));
            for(int eachelement:each1DArray){
                System.out.print(eachelement+ " ");
            }
        }

        for (int a=0; a<arr2D.length; a++){                          //for method
            for(int b=0; b<arr2D[a].length; b++){
                System.out.print(arr2D[a][b]);
            }

        }
    }
}
