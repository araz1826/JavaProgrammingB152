package day20;

public class InterviewPalindromre {
    public static void main(String[] args) {
        String name="kayak";
        String reverse="";
        for(int a=name.length()-1; a>=0; a--){
            reverse= reverse+name.charAt(a);

        }

        if(name.equalsIgnoreCase(reverse)){
            System.out.println("test passed");
        }else {
            System.out.println("failed");
        }
    }
}
