package day20;

public class NameContains {
    public static void main(String[] args) {
        String name =" I love you you";
        int count=0;
        while(name.contains("you")){
            name=name.substring(name.indexOf("you")+1);
            count++;

            }
        System.out.println(count);
        }

}
