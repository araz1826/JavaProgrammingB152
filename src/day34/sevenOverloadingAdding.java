package day34;

public class sevenOverloadingAdding {
    public static void main(String[] args) {
        addmethod(3);
        addmethod(2,3);
        addmethod(1,2,3);
        addmethod(123L,1234L);

    }
    public static void addmethod(int a){
        System.out.println(100+a);

    }
    public static void addmethod(int num, int num2){

        System.out.println(num+num2);
    }
    public static void addmethod(int num3, int num4, int num5) {

        System.out.println(num3+num4+num5);
    }
    public static void addmethod(long a, long b){

        System.out.println(a+b);
    }


}
