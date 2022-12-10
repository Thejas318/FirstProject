package Practice.November2022.DateNov30.CollectionListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        for(int  i = 0; i < 10; i++){
            al.add(i);
        }
        System.out.println("printing the contents of araaylist at once");

        System.out.println("using iterator below to retrieve the objects one by one");

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.println(i);
        }

        System.out.println("using iterator to remove the odd numbered objects from arraylist ");

        Iterator itr1 = al.iterator();

        while(itr1.hasNext()){
            Integer j = (Integer) itr1.next();
            if(j % 2 == 0){
                System.out.println(j);
            }
            else{
                itr1.remove();     //though i am removing from itr1, this will update in the original arraylist also. check the below updated arraylist printed.
            }
        }
        System.out.println("After removing the odd numbers, the new arraylist looks like: " + al);
        System.out.println("Internal implementation class is : " + itr1.getClass().getName()); //Internal implementation class which is creating the interator object though iterator is an interface.
    }                                                                                          //we are only getting corresponding internally implemented class objects not the actual interface objects since it is impossible to create interface objects.

}
