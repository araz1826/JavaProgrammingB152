package day16;

public class StringPractice {
    public static void main(String[] args) {
        String name = "I love Java I love Java Java Java";
        /*int firstIndex = name.indexOf("Java");
        System.out.println(firstIndex);
        int nextIndex = name.indexOf("Java", 8);
        System.out.println(nextIndex);*/

        int f = name.indexOf(" ");
        int s = name.indexOf("", f+1);
        System.out.println("second" +name.substring(f+1,s));


    }
}
