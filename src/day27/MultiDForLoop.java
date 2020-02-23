package day27;

import java.util.Arrays;

public class MultiDForLoop {
    public static void main(String[] args) {
        int[][][] arr3D={{{1,2,3},{4,5,6}}, {{7,8,9},{10,11,12}}};

        for(int a=0; a<arr3D.length;a++){           //this prints all number in array  like 1 2 3 4 5 6 7 8 9 10 11 12
            for(int b=0; b<arr3D[a].length; b++){
                for(int k=0; k<arr3D[a][b].length; k++){
                    System.out.print(arr3D[a][b][k]+" ");
                }

            }
        }
        System.out.println("************");
        System.out.println(Arrays.deepToString(arr3D));   // this prints in single D array  like [[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]]
    }
}
