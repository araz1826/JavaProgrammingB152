package day34;

public class threePasswrodLogin {                   // create a void and return method to check login
                                                        // username is "user". password is "abc123"
    public static void main(String[] args) {

        LoginCheck("user","abc123");
        System.out.println(LoginCheckReturn("user", "abc123"));

                                                                // if login is successfully then call the souts below
                                                                //unless you login you can not do below action
        if(LoginCheckReturn("user", "password")){
            System.out.println("Add Java book in cart");
            System.out.println("I love you");
        }else{
            System.out.println("no shopping");
        }

    }

    public static void LoginCheck(String username, String password){
        if(username.equals("user")&& password.equals("abc123")){
            System.out.println("Successful");
        }else{
            System.out.println("invalid");
        }

    }
    public static boolean LoginCheckReturn(String username, String password){
        if(username.equals("user")&& password.equals("abc123")){
            return true;
        }else{
            return false;
        }

    }
}
