package day21;

public class WhereToStop {
    public static void main(String[] args) {
        String msg="Hello World Hello World";
        int count=0;
        for(int a=0; a<msg.length()-4;a++){

            String newName= msg.substring(a,a+5);
            if(newName.equalsIgnoreCase("hello")){
                System.out.println(a);
                count++;
            }
        }
        System.out.println(count);
    }
}
