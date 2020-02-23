package day20;

public class SameWordPractice {
    public static void main(String[] args) {
        String  sentence ="I love you you you you";
        int count=0;

        for(int a=0; a<sentence.length(); a++){
            if(sentence.charAt(a)=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
