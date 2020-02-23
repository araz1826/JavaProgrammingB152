package day19.day17;

public class FullnameString {
    public static void main(String[] args) {
        String name="araz ismayilov";
        String firstname = name.substring(0,1).toUpperCase();
        String fn = firstname+ name.substring(1,4).toLowerCase();


        String lasttname = name.substring(5,6).toUpperCase();
        String ln = lasttname+ name.substring(6,14).toLowerCase();


        System.out.println(fn +" "+ ln);
    }
}
