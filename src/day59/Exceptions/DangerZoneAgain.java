package day59.Exceptions;

import java.io.FileNotFoundException; // with declaring, it is not handlig, it is not just giving compile error.

                                                                  //throws and throw
public class DangerZoneAgain {
    public static void main(String[] args) throws InterruptedException {

        try {
            reamMyFile();  // you need to declare to throws checked exceptions as above in main method
        } catch (FileNotFoundException e) {
            System.out.println("handeled");
        }

        Thread.sleep(3000); //pause it for 3 sec. and declared to throw another exception.
        System.out.println("the end");

    }

        public static void reamMyFile() throws FileNotFoundException {    //why it is static, to call it directly
        System.out.println("reading my file in my computer");
            throw  new FileNotFoundException(" kaboom, file is not here");
    }

}
