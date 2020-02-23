package day33;

public class twoAddinTillXandEmail {
    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(buildemail("araz", "ismayilov"));

        // next question is
        String name="araz ismayilov";  // if you have name and last name and wanto to put together in method below.
        String [] splitter=name.split(" ");
        String email=buildemail(splitter[0],splitter[1]);
        System.out.println(email);


    }
    public static int add(int x){     //add number from 0 to x with return type method
        int sum=0;
        for (int a=0; a<=x; a++){
            sum=sum+a;

        }
        return sum;
    }
    public static String buildemail(String name, String lastname){
        String email=name+lastname+"@nightwatch.com";

        return email;

    }
}
