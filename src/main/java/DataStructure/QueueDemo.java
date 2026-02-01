package DataStructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    static  void main(){
        // maintain the order and first in first out
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("r");
        System.out.println(queue);
        System.out.println("Initial queue: " + queue);
        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Queue after dequeue: " + queue);


        Queue<String>queue1= new PriorityQueue<>();
        queue1.add("a");
        queue1.add("b");
        queue1.add("d");
        queue1.add("j");
        queue1.add("l");
        System.out.println("--------------");
        System.out.println("Initial queue: " + queue1);
        System.out.println("Dequeued: " + queue1.remove());
        System.out.println("Queue after dequeue: " + queue1);



    }
}
