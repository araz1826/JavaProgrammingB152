package day31;



public class fourMethodPactice2 {
    public static void count1to10(){
        for( int a=1; a<=10; a++){
            System.out.print(a+" ");
        }
        System.out.println();    //this gives space for the next print
    }

    public static <Scannner> void main(String[] args) {    //create reusable code to count from 1 to 10,
                                                // name count1to10
                                                // it should be accesable from anywhere

        count1to10();
        System.out.println();
        count1to10();
        oddnumberfrom1to100();
        spellyourname();


    }
public static void oddnumberfrom1to100(){
        for(int a=0; a<=100; a++){
            if(a%2!=0){
                System.out.print(a+" ");
            }
            System.out.println();
        }
}
public static void counddown20(){
    for(int a=20; a>=0; a--){
        System.out.print(a+" ");
    }
    System.out.println();
}
public static void spellyourname(){
        String name="araz";
    for(int a=0; a<name.length(); a++){
        System.out.println(name.charAt(a)+"-");


    }
    System.out.println();
}

    }
