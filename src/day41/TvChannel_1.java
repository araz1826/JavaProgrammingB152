package day41;

public class TvChannel_1 {
    public static void main(String[] args) {
        Tv_1 input=new Tv_1();
        input.name="Sony";

        System.out.println(input.toString());
        input.turnOn();

        input.setCurrentChannel(12);
        input.setCurrentChannel(56);
        System.out.println(input.currentChannel);

        input.turnOff();

        System.out.println(input.toString());







    }
}
