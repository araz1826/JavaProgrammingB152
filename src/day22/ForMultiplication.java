package day22;

public class ForMultiplication {
    public static void main(String[] args) {

        for(int timesTable=1;timesTable<=10; timesTable++){
            System.out.println("Multiplication table: "+timesTable);
            for(int a=1; a<=10; a++){
                System.out.println(timesTable+ " x " +a+ " = "+ timesTable*a);
        }


        }
    }
}
