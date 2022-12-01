package Practice.November2022.DateNov30;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
       l1.add("Thejas");
       l1.add(25);
       l1.add("Developer");
       l1.add(null);

        System.out.println("Original linked list is : " + l1);

        l1.add("Thejas");
        System.out.println("duplicates are allowed: "+ l1);
        l1.add(0, "Full Stack");
        System.out.println("Added an element at 0: " + l1);

        l1.remove(1);
        System.out.println("Removed an element at position 1: " + l1);

        l1.addFirst("First element");
        System.out.println("added first element using addfirst method: " + l1);
    }
}
