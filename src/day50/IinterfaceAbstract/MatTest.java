package day50.IinterfaceAbstract;

public class MatTest {
    public static void main(String[] args) {

        Addition a1= new Addition(10,90);
        System.out.println(a1);
        a1.calculate();
        System.out.println(a1);

        Subtraction s1= new Subtraction(6,5);
        System.out.println(s1);
        s1.calculate();
        System.out.println(s1);

        Subtraction s2= new Subtraction(6,15);
        System.out.println(s1);
        s1.calculate();
        System.out.println(s1);

    }
}
