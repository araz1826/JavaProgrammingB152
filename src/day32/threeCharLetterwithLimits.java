package day32;

public class threeCharLetterwithLimits {
    public static void main(String[] args) {      //print out A-D in main method
        alphabet('A', 'D');
        printAlphabeticorder('a', 'g');  // below belonging code is for if we do not know the letters
        printAlphabeticorder('Z','F');
        printAlphabeticorder('A','v');
    }
    public static void alphabet(char letter1, char letter2) {
        for (char i = letter1; i <=letter2; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printAlphabeticorder( char beginning, char ending){  //if we do not know the what the letters are and their order
        if(beginning<ending){
            //System.out.println("incerement"+ beginning+ending);
            for(char ichar=beginning; ichar<=ending; ichar++){
                System.out.print(ichar+ " ");
            }
            System.out.println();
        }else if(beginning>ending){
            //System.out.println("decrement"+ beginning+ending);
            for(char ichar=beginning; ichar>=ending; ichar--){
                System.out.print(ichar+ " ");
            }
            System.out.println();
        }else{
            System.out.println("they are same character");
        }

    }
}
