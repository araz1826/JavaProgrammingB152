package day52Polymorphisim;

import day23.DoubleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTogetheCall {

        public static void main(String[] args) {

           // Book b1=new Book(); you can not say this beacuse it is abstract

            Book b1=new PaperBook("Java","Elcin",3);
            Book b2= new AudioBook("SELENIUM","QULAM",3);
            Book b3= new PaperBook("OCA", "CUMALI", 4);

       AudioBook a1= new AudioBook("Cin Ali", "araz",10);
        a1.displayBookInfo();

        PaperBook p1=new PaperBook("sari gelin","aynar",3);
        p1.displayBookInfo();

        p1.takeNote();

        KnowLedgeBank k1=b1;  //
        k1.showTableOfContent();
        k1.takeNote();

// create an array store b1 b2 b3 in and counting how many paperbook we have

            List<Book> lst= Arrays.asList(b1,b2,b3);
            int pcount=0;
            for (Book each: lst) {
                String className= each.getClass().getSimpleName();//this gets the class then name
                System.out.println(className);
              if(className.equals("PaperBook")){
                  ++pcount;
              }
            }
            System.out.println(pcount);


    }


}
