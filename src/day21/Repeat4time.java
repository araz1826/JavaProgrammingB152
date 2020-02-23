package day21;

public class Repeat4time {
    public static void main(String[] args) {
        for(int a=1; a<=4; a++){
            for(int x=1; x<=10; x++){
                if(x%2!=0){
                    System.out.print(x+" ");
                }

            }
            System.out.println();
        }
    }
}
