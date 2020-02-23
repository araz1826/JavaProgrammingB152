package day14;

public class CharIndexPracice {
    public static void main(String[] args) {
        String name = "Game of Java";

        /*System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));
        boolean input = name.contains("Kawa");
        System.out.println(input);
*/
        if(name.indexOf("kawa")>-1){
            System.out.println("kawa found");
        }else{
            System.out.println("kawa not found");
        }


    }
}
