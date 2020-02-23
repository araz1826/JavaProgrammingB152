package day21;

public class IntegerToString {
    public static void main(String[] args) {
        int num = 1234567;
        String letter = Integer.toString(num);
        for(int a =0; a<letter.length();a++){
            System.out.println(letter.charAt(a));

        }
    }



}
