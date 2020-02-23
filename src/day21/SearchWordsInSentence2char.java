package day21;

public class SearchWordsInSentence2char {
    public static void main(String[] args) {
        String name="anaanaana";
        int count=0;
        for( int x= 0; x<name.length()-1;x++){
            String current =name.substring(x,x+2);
            if(current.equalsIgnoreCase("an")){
                System.out.println(x);
                count++;
            }
        }
        System.out.println(count);
    }
}
