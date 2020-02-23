package day22;

public class SelfPracticeINDEX {
    public static void main(String[] args) {
        String name="araz, my name is araz name";
        int count=0;
        for(int a=0; a<name.length()-1;a++) {
            if(a%2!=0){
                continue;
            }else if(name.substring(a,a+1).equalsIgnoreCase("i")){
                break;
            }
            System.out.print(name.charAt(a));
        }

    }
}
