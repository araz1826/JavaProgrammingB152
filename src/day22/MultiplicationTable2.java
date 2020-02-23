package day22;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        //multiplication table of 2
        int multiply=1;
        int sum=0;
        for(int x=2; x<=10;x++){
            multiply=x*2;
            System.out.println("1 x " +x+ " = "+ multiply);
            sum+=multiply;

        }
        System.out.println("sum: "+sum);
    }
    }

