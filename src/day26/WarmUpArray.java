package day26;

public class WarmUpArray {
        public static void main(String[] args) {
        int [] myNumbers=new int [4];


            myNumbers[0]=10;
            myNumbers[1]=40;
            myNumbers[2]=50;
            myNumbers[3]=7;
            int size=myNumbers.length;
            System.out.println(myNumbers[myNumbers.length-1]); // print out last item
            System.out.println(myNumbers[3]); // ot if you know the index number

            // add 1 to the second item
            myNumbers[1]= myNumbers[1]+1;
            // how to double it
          myNumbers[2]= myNumbers[2]*2;

            System.out.println(myNumbers[1]+1);// add 1



            myNumbers[3]=myNumbers[1]+myNumbers[2];// how to assgn 3rd value is su of 1 and 2
            myNumbers[0]=myNumbers[myNumbers.length]; // swap frist with last





    }
}
