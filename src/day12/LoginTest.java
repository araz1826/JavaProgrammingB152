package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "pass123";

        if(userName.equalsIgnoreCase("user123") && password.equalsIgnoreCase("pass123")){
            System.out.println("login successful");
        } else if(!userName.equalsIgnoreCase("user123")){
            System.out.println("your user name is not correct");
        } else if(userName.equalsIgnoreCase("username") || !password.equalsIgnoreCase("pass123")){
            System.out.println("password is not correct");
        }
    }
}
