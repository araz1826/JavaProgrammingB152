package day64.CollectionQueueMap;
                                    //QUEUE: First In First Out data structure. whichever item is first will remove the first item
                                                            //in the list. LinkedList is the implementation class of Queue
                                                // accept dups
import java.util.LinkedList;
import java.util.Queue;

public class QueueFIFO {
    public static void main(String[] args) {   // add=offer, you can use both, remove=poll, you can use remove

        Queue<String> task=new LinkedList<>();
        task.add("review the previous class");
        task.add("do your homework");
        task.add("attend the class");
        task.add("say bye to java");
        System.out.println("task = " + task);
        
        task.remove();
        System.out.println("task = " + task); //removes the first item
        
    }
}
