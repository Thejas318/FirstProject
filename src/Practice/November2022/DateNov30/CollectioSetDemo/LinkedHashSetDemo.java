package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("Thejas");
        h.add("Developer");
        h.add(10);
        h.add(null);
        h.add("Bangalore");

        System.out.println(h.add("Developer"));     //Trying to add the duplicates. Check the result. it'll be false.
        System.out.println(h);                      //Insertion order will be preserved. check the result. This is the only difference between Hashset and linked hashset. everything else is same.
    }
}
