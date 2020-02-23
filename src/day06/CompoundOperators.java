package day06;

public class CompoundOperators {
    public static void main(String[] args) {

        int studenOnline = 263;
        studenOnline +=5;

        System.out.println("5 people joined" + studenOnline);

        studenOnline -= 3;
        System.out.println("3 students left" + studenOnline);

        studenOnline *= 2;
        System.out.println("numbers doubled: " + studenOnline);

        studenOnline /=3;
        System.out.println("1/3 of students dropped: " + studenOnline);


    }
}
