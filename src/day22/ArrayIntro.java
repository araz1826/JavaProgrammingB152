package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] num = new int[4];
        num[0]=95;
        num[1]=70;
        num[2]=88;
        num[3]=100;
        System.out.println(num[0]);


        for(int item: num){
            System.out.println(item);
        }

        for (int a=0; a<4; a++){
            System.out.println(num[a]);
        }
    }
}
