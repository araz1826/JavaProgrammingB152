package day58.Exception;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) {   // you can put THROWS EXCEPTION here or try catch below
        try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (Exception e){
            System.out.println("exception handeled");
        }finally {
            System.out.println("finally block even exceptio or no ");
        }





    }
}
