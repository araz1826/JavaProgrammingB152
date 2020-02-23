package day27;

public class MultiDArrayMAX {
    public static void main(String[] args) {
        int [][] numbers={{12,11,10,19}, {19,20,15}};    //multi D max number,  for loop

        int max= numbers[0][0];
        for(int a=0; a<numbers.length; a++){
            for(int b=0; b<numbers[a].length; b++){
                if(numbers[a][b]>max){
                    max=numbers[a][b];
                }
            }
        }
        System.out.println(max);                             //for each loop
        System.out.println("*********************");

        for(int[] item:numbers){
            for(int foreach:item){
                if(foreach>max){
                    max=foreach;
                }
            }
        }
        System.out.println(max);

        System.out.println("*************");
        int min= numbers[0][0];
        for(int a=0; a<numbers.length; a++){
            for(int b=0; b<numbers[a].length; b++){
                if(numbers[a][b]<min){
                    min=numbers[a][b];
                }
            }
        }
        System.out.println(min);
    }

}
