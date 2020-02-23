package day22;

public class SelfPracticeLoveJava5 {
    public static void main(String[] args) {
        //print out "I struggle with Java I like Java I,love Java Everything is Awesome!"
        //print every other letter
        //use CONTINUE
        //when you reach a break the loop

        String msg = "I struggle with Java I like love Java ava Everything is Awesome!";

        for (int a = 0; a < msg.length(); a++) {

            if (a % 2 != 0) {
                continue;

            }else if(msg.substring(a, a + 1).equalsIgnoreCase("a")) {
                break;

            }
            System.out.print(msg.charAt(a) + " ");

        }

    }
}
