package day59.Exceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;        //Files.readAllLines(Paths.get());

                                //this reads things in note.txt file

import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {
try {
    List<String> allLines = Files.readAllLines(Paths.get("src/day59.Exceptions/note.txt")); //this is where your note.txt is (we create file for note.txt and hero.txt)
    System.out.println("allLines = " + allLines);
    for (String eachLine : allLines) {
        System.out.println(eachLine);
    }
}catch (Exception e){
    System.out.println("exception handeled");
    System.out.println(e.getMessage());
}
    }     // if there is no file in note.txt  then will be exception error so you dod this.
}
