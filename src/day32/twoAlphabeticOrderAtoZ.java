package day32;

public class twoAlphabeticOrderAtoZ {
    public static void main(String[] args) {    //alphabetic order and reverse order
        alphabet();
        reverseorder();
    }
    public static void alphabet() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseorder(){
        for (char x = 'Z'; x >='A' ; x--) {
            System.out.print(x + " ");
        }
    }


}
