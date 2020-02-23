package day19;

public class Stringreplit {
    public static void main(String[] args) {
        String name ="lotus school for excellence";
        int counter=0;

        for(int a=0;a<name.length();a++){
            if(name.charAt(a)=='e'){
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
