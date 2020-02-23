package day63.CollectionSETandMAP;

import java.io.File;              //get file from Employee txt and read it
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//how to create file and read froom file  (create it right click on package,
                                     //     below the java class there is a file  but do not forget to add .txt
                                     //     and copy path with right click)
public class ReadFromFile {
    public static void main(String[] args) throws IOException {  //file throws and exception

        List<String> alldata=Files.readAllLines(Paths.get("C:\\Users\\arazi\\IdeaProjects\\JavaProgrammingB15\\src\\day63\\CollectionSETandMAP\\EmployeeData.txt"));

        for (String each:alldata) {
            System.out.println(each);

        }

        alldata.forEach(each-> System.out.println(each));

        String line="1,lilian";
       int id= Integer.parseInt(line.split(",")[0]); // to get 1 as an int
        String name= line.split(",")[1];

        Map<Integer,String> idNumberPair=new HashMap<>();


    }
}
