package Practice.November2022.DateNov30.CollectionListDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInterfaceDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println("Printing the objects of vector at once: " + vector); //this will print all the objects in the vector. but i want to retrive the objects one by one.

        System.out.println("Using enumeration below to retrieve the objects one by one");
        Enumeration e = vector.elements();

        while (e.hasMoreElements()) {
            Integer j = (Integer) e.nextElement();
            System.out.println(j);
        }


        System.out.println("To only print even numbers");
        Enumeration f = vector.elements();
        while (f.hasMoreElements()) {
            Integer k = (Integer) f.nextElement();
            if (k % 2 == 0) {
                System.out.println(k);
            }

        }

        System.out.println("Printing the vctor again: " + vector );
        System.out.println("Internal implementation class is : " + f.getClass().getName()); //Internal implementation class which is creating the enumeration object though enumeration is an interface.
    }                                                                                     //we are only getting corresponding internally implemented class objects not the actual interface objects since it is impossible to create interface objects.
}


