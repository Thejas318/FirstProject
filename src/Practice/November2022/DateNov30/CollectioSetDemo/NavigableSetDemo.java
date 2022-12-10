package Practice.November2022.DateNov30.CollectioSetDemo;

//Demo program to show the working od Navigable Set

import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();

        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);
        t.add(6000);
        t.add(7000);
        t.add(8000);
        System.out.println("The Treeset object after element addition: " + t);

        Integer i =  t.ceiling(3000);     //returns the element which is greater than or equal to 3000 in our treeset.
        System.out.println("Element which is greater than or equal to 3000 in our Treeset: " + i);

        Integer i1 = t.higher(3000);    //returns the element which is greater than  3000 in our treeset.
        System.out.println("the element which is greater than  3000 in our treeset: " + i1);

        Integer i2 = t.floor(5000);    //returns the element which is less than or equal to 3000 in our treeset.
        System.out.println("the element which is less than or equal to 5000 in our treeset: " + i2);

        Integer i3 = t.lower(5000);   ////returns the element which is less than 5000 in our treeset.
        System.out.println("returns the element which is less than 5000 in our treeset: " + i3);

        t.pollFirst();
        System.out.println("treeset after using pollfirst method: " + t);

        t.pollLast();
        System.out.println("treeset after using polllast method: " + t);

        System.out.println("Treeset after using descending Set method: " + t.descendingSet());

        //below is the another way of doing descendent treeset.
       // TreeSet t1 = (TreeSet) t.descendingSet();            //descendingset() returns navigable set so we have to type cast it.
       // System.out.println("Treeset after using descending Set method: " + t1);
    }
}
