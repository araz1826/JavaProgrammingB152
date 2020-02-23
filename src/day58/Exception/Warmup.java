package day58.Exception;

import java.util.ArrayList;
import java.util.List;

public class Warmup {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(999999999);

        for (int i = 1; i >9 ; i++) {
            list.add(i);
        }
        System.out.println(list);  // will throm you to exceptions because out of heap space, OutOfMemoryError: Java heap space
    }
}
