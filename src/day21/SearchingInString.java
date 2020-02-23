package day21;

public class SearchingInString {
    public static void main(String[] args) {
        String word= "Daria Azer";
        int count=0;
        for(int a=0; a<word.length(); a++){
            if (word.charAt(a)=='a' || word.charAt(a)=='A'){
            count++;

            }

        }

        System.out.println(count);
    }
}
