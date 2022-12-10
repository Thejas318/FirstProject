package Practice.November2022.DateNov30.CollectionsQueue;


//Demo program for customized sorting in priority queue

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(10, new MyComparator1());

        q.offer("A");
        q.offer("Z");
        q.offer("K");
        q.offer("Q");
        q.offer("R");
        q.offer("P");

        //though we are expecting the output to be sorted in reverse alphabitcal order. it will be given in random order.
        //this is not the problem with our code. some platforms like windows wont provide proper support for thread priorities and priority queue
        // this can be solved by service provider. they will give patch to install which will solve the problem.


        System.out.println(q);
    }
}
