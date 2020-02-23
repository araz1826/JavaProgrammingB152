package day32;
                                                            //and print your name in reversed order
public class oneReverseNamesMethod {
    public static void main(String[] args) {               //reversePrintMyOwnName, "dash -" between char, but no - at the end

             reversname();
        reversnamenodash("araz");
        reversnamenodash("aynar");

        reversewithdash("hasan");
    }
    public static void reversname() {
        String name = "araz";
        for (int a = name.length() - 1; a >= 0; a--) {
            System.out.print(name.charAt(a) + " ");
        }
        System.out.println();
    }
    // print each char with  "dash -" between char, but no - at the end
    public static void reversnamenodash(String name) {

        for (int a =0; a<name.length(); a++) {
            System.out.print(name.charAt(a));
          if(a !=name.length()-1){
              System.out.print("-");
          }

        }
        System.out.println();
    }

    public static void reversewithdash(String letter){    // reverse name with dash between but no dash at the end

        for(int b=letter.length()-1; b>=0; b--){
            System.out.print(letter.charAt(b));
            if(b !=0){
                System.out.print("-");
            }
        }

    }

}



