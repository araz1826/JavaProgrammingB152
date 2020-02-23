package day64.CollectionQueueMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListTogether {
    public static void main(String[] args) {
        Map<String, List<String>> group=new HashMap<>();
        group.put("group1", Arrays.asList("araz", "aynar"));
        group.put("group2",Arrays.asList("hasan", "khayala"));

        //print all with lambda
        group.forEach((groups,members)-> System.out.println("group name and members: "+groups+""+members));

        //how to print aynar
        System.out.println(group.get("group1").get(1)); //printing aynar  1st get get into group 2nd one is in list so get into index aynar

        //check khayala in group2 or not
        System.out.println(group.get("group2").contains("khayala"));
    }
}
