package day19.day17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 47) {
            x++;
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + ":Fizz Buzz");
            } else if (x % 3 == 0) {
                System.out.println(x + ": Fizz");
            } else if (x % 5 == 0) {
                System.out.println(x + ": Buzz");
            }

        }
    }
}
