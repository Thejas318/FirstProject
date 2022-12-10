package Practice.November2022.DateNov30.CollectionListDemo;

//Demo of the backward iterator separately

import java.util.LinkedList;
import java.util.ListIterator;

public class BackwardListIterator {
    public static void main(String[] args) {
        LinkedList ltr = new LinkedList();

        ltr.add("sudeep");
        ltr.add("Rakshith");
        ltr.add("Rishabh");
        ltr.add("Shetty");

        System.out.println("printing the linked list objects at once: " + ltr);

        System.out.println("Using backward listiterator to retrieve objects one by one");

        ListIterator l1 = ltr.listIterator(4) ;     //setting the cursor at the end of the list for backward iteration.

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
        System.out.println("New Linked list after performing backward iterator operation: " + ltr);
    }
}
