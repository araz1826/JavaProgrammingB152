package day14;

public class EmailChecker {
    public static void main(String[] args) {
        String email= "arazismailov@yahoo.com";
        boolean character = email.contains("@");
        boolean space = !email.contains(" ");
        boolean ends1 = email.endsWith("@gmail.com");
        boolean end2 = email.endsWith("@yahoo.com");
        boolean ends3 = email.endsWith("@mail.ru");

        if(character && space && ends1){
            System.out.println("gmail");

        }else if (character && space && end2){
            System.out.println("yahoo");
        } else if(character && space && ends3){
            System.out.println("Russian");
        }else{
            System.out.println("Invalid");
        }
    }
}
