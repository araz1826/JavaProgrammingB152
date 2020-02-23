package day32;

public class nineIntRETURNmethod {
    public static void main(String[] args) {       //addition and division below
        System.out.println(add(3,4));
        //or
        int sum=add(3,4);
        System.out.println(sum);

        System.out.println(addition(4,5));

    }
    public static int add(int a, int b){
        int result=a+b;
        return result;

    }
    public static int addition(int a, int b){

        return a+b;
}


}
