package day42;

public class MovieAction3 {
    public static void main(String[] args) {
       Movie3 m1=new Movie3("Zorro",2,"action");
       Movie3 m2=new Movie3("frozen", 1,"cartoon");
        System.out.println(m1);
        System.out.println(m2);

        //System.out.println(m1.name+" "+m1.length+" "+m1.type); if you do not put
                   //toString method then you have to do this.

        System.out.println(m2.getName());

        //INTERVIEW: how you create a immutable method: it is just creating
        //getter method but not setter that we can not change it.
        //IMMUTABLE CLASS: does not have a setter but setter.
                //ONLY READS-

    }
}
