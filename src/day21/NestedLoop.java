package day21;

public class NestedLoop {
    public static void main(String[] args) {
        for(int a=1; a<=5; a++){ // this tells you how many times you will print out
            for(int x=1; x<=3; x++){ // it is a range of printing
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
