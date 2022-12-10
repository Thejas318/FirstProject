package Practice.November2022.DateNov30.MAPS;

//Demo to show that the hashmap is stronger than the weak hashmap

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {


        HashMap m = new HashMap();
        Temp t = new Temp();

        m.put(t, "Thejas");
        System.out.println("HashMap object after insertion of an entry" + m);

        t = null;

        System.gc();         //if garbage collector is called then definetly the finalize method in temp class will called which prints "Finalize method called"
        Thread.sleep(5000);
        System.out.println("Hashmap even after calling the garbage collector: " + m);

        // In the above example temp object not eligible garbage collection, bcoz it is associated with hashmap.
        // In this case the output is 1st time --> {temp = Thejas} and 2nd time --> {temp = Thejas}.
        // In the above program if we replace hashmap with weak hashmap, then temp object is eligible for garbage collection.
        // In that case output is 1st time {temp = Thejas} then "Finalize method called" and after that just {} bcoz the object is deleted.

        WeakHashMap m1 = new WeakHashMap();
        Temp t1 = new Temp();

        m1.put(t1, "Thejas");
        System.out.println("WeakHashMap object after insertion of an entry: " + m1);

        t1 = null;

        System.gc();    //if garbage collector is called then definetly the finalize method in temp class will called which prints "Finalize method called"
        Thread.sleep(5000);

        System.out.println("Weakhasmap after calling the garbage collector: " + m1);


    }
}