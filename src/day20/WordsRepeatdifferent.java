package day20;

public class WordsRepeatdifferent {
    public static void main(String[] args) {
        String name = "ismayilo";
        for (int a = 0; a < name.length() - 1; a ++) {
            System.out.println(name.substring(a, a + 2));

        }
    }
}