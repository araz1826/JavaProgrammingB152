package day21;

public class SearcCharInSentence {
    public static void main(String[] args) {
        String  sentence ="I love you you you you";
        int count=0;

        for(int a=0; a<sentence.length(); a++){
            if(sentence.charAt(a)=='o'){
                count++;
            }
        }
        System.out.println(count);


    }
}
