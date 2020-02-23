package day22;

public class MultiplicationTable {
    public static void main(String[] args) {
        //multiplication table
        int multiply=1;
        int sum=0;
        for(int x=1; x<=10;x++){
            multiply=x*1;
            System.out.println("1 x " +x+ " = "+ multiply);
            sum+=multiply;

        }
        System.out.println("sum: "+sum);
    }
}
