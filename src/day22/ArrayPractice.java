package day22;

public class ArrayPractice {
    public static void main(String[] args) {
        byte [] data = new byte[4];
        data[0]=30;
        data[1]=40;
        data[2]=50;
        data[3]=60;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        System.out.println();

        for( int item: data){
            System.out.println(item);
        }

    }
}
