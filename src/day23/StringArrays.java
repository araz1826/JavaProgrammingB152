package day23;

public class StringArrays {
    public static void main(String[] args) {
        String[] shows={"Orville", "Gifted", "Game of Throne","Flash", "Arrow", "Super girl"};

        System.out.println("show count: "+ shows.length);
        for(int x=0; x<shows.length;x++){

            System.out.println(shows[x]+":"+shows[x].length());
            System.out.println(shows[x].substring(0,3)); //first 3 char of each string
            System.out.println(shows[0].substring(0,3)); //

        }


    }
}
