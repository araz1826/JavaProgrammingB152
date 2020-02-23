package day11;

public class StringLearning2 {
    public static void main(String[] args) {

        String name = "Araz Ismayilov Isa oglu";
        String ay = "aynar";
        String gun = "hasan";
        System.out.println(ay.equals(gun));
        System.out.println(ay.charAt(2));
        System.out.println(ay.indexOf('a',2));
        System.out.println(ay.indexOf("nar"));
        System.out.println(ay.length());
        System.out.println(gun.trim());
        System.out.println(gun.startsWith("a"));
        System.out.println(ay.replace('a', 'q'));
        System.out.println(ay.concat(" balam oynayir "+ gun + " balam tullanir"));


    }
}
