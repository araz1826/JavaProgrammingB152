package day15;

public class LordOfTheRng {
    public static void main(String[] args) {
        String movie = "Lord Of The Ring";

        /*int start = movie.indexOf(" ")+1;
        int end = movie.length();
        System.out.println(movie.substring(start,end));

        int  startt = movie.indexOf("Of");

        int endd = movie.indexOf("ng")+2;
        System.out.println(movie.substring(startt,endd));
        System.out.println(movie.substring(startt));
        */
        String reverse = movie.substring(12,16)+ " "+ movie.substring(5,11) + " Java "+ movie.substring(0,4);
        System.out.println(reverse);
         // same but different solution
        String ring = movie.substring(12,16);
        String ofthe = movie.substring(5,11);
        String lord = movie.substring(0,4);
        System.out.println(ring + " "+ ofthe + " " + lord);

    }
}
