package day10;

public class Answer {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 99;

        if (myNumber %5 == 0) {
            myAnswer = " It is divisible by five";
        } else {
            myAnswer = "it is fizz";
        }
        System.out.println(myAnswer);

    }
}
