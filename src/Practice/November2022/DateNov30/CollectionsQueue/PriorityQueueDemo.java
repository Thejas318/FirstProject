package Practice.November2022.DateNov30.CollectionsQueue;

//Demo for Default natural sorting order for priority queue

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();

        System.out.println(p.peek());      //return null if there is no head in the queue.
       // System.out.println(p.element());     //return run time exception --> no such element exception if there is no element in the queue.

        for(int i = 0; i <= 10; i++){
            p.offer( i);
        }
        System.out.println( "The elements in the queue are : " + p);

        System.out.println(p.poll());     //returns and removes the head of the queue.

        System.out.println("The queue after using the poll method once: " + p);   //after using poll method once when we try to print the queue, the sorting order is gone and elements will be printed in random order.
                                                                                //this is not the problem with our code. some platforms wont provide proper support for thread priorities and priority queue
                                                                                 // this can be solved by service provider. they will give patch to install which will solve the problem.
    }
}
