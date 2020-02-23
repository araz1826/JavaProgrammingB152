package day26;

public class NumbersTaskArray {
    public static void main(String[] args) {
        int[] scores= new int[]{156,101,76,87,187,110};   //if any number less than 100, exit and say No

      String finalresult=" ";
        for(int item:scores) {
            if(item<=100){
                finalresult="no";
                break;
            }
        }

        System.out.println(finalresult);

    }
}
