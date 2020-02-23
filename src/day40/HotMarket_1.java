package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class HotMarket_1 {
    public static void main(String[] args) {

        Offer_1 input1=new Offer_1();
        input1.location="CA";
        input1.company="apple";
        input1.isFulltime=true;
        input1.salary=135000;
        input1.displayInformation();

        // if this guy earn more than 100K move him to ATLANTA
        //boolean result=input1.is100koffer(); this is how u store
        if(input1.is100koffer()==true){
            input1.changeLocation("Atlanta");
        }
        input1.displayInformation();

        System.out.println(input1.is100koffer());


        System.out.println("//////////////////////");
        String store=input1.toString();
        System.out.println(store);
        //System.out.println(input1.toString());
        System.out.println("------------");

        input1.changeAllInfo("culfa","iphone", 200000,true);

        Offer_1 input2=new Offer_1();
        input2.location="WA";
        input2.company="google";
        input2.isFulltime=true;
        input2.salary=145000;
        input2.displayInformation();

        Offer_1 input3=new Offer_1();
        input3.location="VANCOUVER";
        input3.company="Amazon";
        input3.isFulltime=false;
        input3.salary=96000;
        input3.displayInformation();

        Offer_1 input4=new Offer_1();
        input4.displayInformation();

                                            //add 2 k to amazon offer
        input3.salary=input3.salary+2000;
        System.out.println("new amazon salary:"+input3.salary);

        //set the salary value of input4 offer object to sum o all the offers
        input4.salary=input1.salary+input2.salary+input3.salary;
        input4.displayInformation(); //set everything to input4
        input4.turnToFulltime();
        input4.displayInformation();
        input4.changeLocation("DC");
        input4.displayInformation();


        //create a ARRAYlist of offer and you can add objects (IMPORTANT)
        //ArrayList<Offer_1> myOffers=new ArrayList<>(Arrays.asList(input1,input2,input3));//one shot
        ArrayList<Offer_1> myOffer=new ArrayList<>();
        myOffer.add(input1);
        myOffer.add(input2);
        myOffer.add(input3);

        System.out.println("my offer:"+"+++++++++++++++++++");

        for (Offer_1 item:myOffer) {
            item.displayInformation();
        }
        System.out.println("********************************");
        for (int i = 0; i <myOffer.size() ; i++) {   //store then print
            myOffer.get(i).displayInformation();

            //Offer_1 each=myOffer.get(i);
            //each.displayInformation();
        }

    }
}
