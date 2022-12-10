package Practice.November2022.DateNov30.CollectionListDemo;

//demo of forward and backward using the most powerfull cursor "ListIterator".

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList ltr = new LinkedList();
        ltr.add("Vishnu");
        ltr.add("Raj");
        ltr.add("Prabhakar");
        ltr.add("Shankar");
        ltr.add("Ambareesh");
        ltr.add("sudeep");
        ltr.add("Rakshith");
        ltr.add("Rishabh");
        ltr.add("Shetty");


        System.out.println("printing the linked list objects at once: " + ltr);

        System.out.println("Using listiterator to retrieve objects one by one");
        ListIterator l = ltr.listIterator();
        while (l.hasNext()){
            String str = (String) l.next();

            if ((str.equals("Raj"))){
                l.remove();
            }
            if ((str.equals("Shankar"))){
                l.add("Nag");
            }
            if ((str.equals("Ambareesh"))){
                l.set("Yash");
            }

        }
        System.out.println("New linked list after performing Listiteration operation: " + ltr);

        ListIterator l1 = ltr.listIterator(9) ;    //setting the cursor at the end of the linked list for backward iteration

        while (l1.hasPrevious()){
            String str1 = (String) l1.previous();
            if(str1.equals("sudeep")){
                l1.remove();
            }
            if ((str1.equals("Rishabh"))){
                l1.set("Rishab Shetty");
            }
            if ((str1.equals("Shetty"))){
                l1.add("Chikkanna");
            }
        }
        System.out.println("New Linked list after performing both forward and backward iterator operation: " + ltr);
        System.out.println("Internal implementation class is : " + l.getClass().getName()); //Internal implementation class which is creating the listinterator object though listiterator is an interface.
        System.out.println("Internal implementation class is : " + l1.getClass().getName()); //we are only getting corresponding internally implemented class objects not the actual interface objects since it is impossible to create interface objects.
    }

}
