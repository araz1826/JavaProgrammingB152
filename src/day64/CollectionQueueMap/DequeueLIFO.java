package day64.CollectionQueueMap;

import java.util.Deque;
import java.util.LinkedList;

                                                    //DEQUEUE {DEK}: it is interface; linkedlist is a implementation class
                                                            //Last in First Out
public class DequeueLIFO {
    public static void main(String[] args) {

        Deque<String> lifo=new LinkedList<>();
        lifo.add("review the previous class");
        lifo.add("do your homework");
        lifo.add("attend the class");
        lifo.add("say bye to java");
        System.out.println("lifo.removeLast() = " + lifo.removeLast());  //remove last item
        System.out.println("lifo.removeFirst()= "+lifo.removeFirst());//remove first item



    }
}
