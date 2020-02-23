package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {

                                           //how to swap names: make sure you store in temporary
        String name1="Emma";
        String name2="Jason";
        String temp=name1;
        name1=name2;
        name2=temp;

        System.out.println(name1+" "+name2);

                                            //swap the value of First item with last item
        int [] myNumbers={10,40,30,7};

         int temporary=myNumbers[0];

        myNumbers[0]=myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1]=temporary;
        System.out.println(Arrays.toString(myNumbers));

                                                      //swap 2nd and 3rd
        int c=myNumbers[1];
        myNumbers[1]=myNumbers[2];
        myNumbers[2]=c;
        System.out.println(Arrays.toString(myNumbers));

    }
}
