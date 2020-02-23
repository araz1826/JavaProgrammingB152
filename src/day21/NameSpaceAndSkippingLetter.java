package day21;

public class NameSpaceAndSkippingLetter {
    public static void main(String[] args) {
        String myName = "My name is araz";
        int count=0;

        for (int i = 0; i < myName.length(); i++) {
            System.out.print(myName.substring(i, i + 1) + "->");
            count++;

        }

        System.out.println();
        for (int b = 0; b < myName.length()-1; b+=3) {
            System.out.print(myName.substring(b, b + 3) + "->");
        }


    }
}