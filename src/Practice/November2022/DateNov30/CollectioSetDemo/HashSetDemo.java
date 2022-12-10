package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("Thejas");
        h.add("Developer");
        h.add(10);
        h.add(null);
        h.add("Bangalore");

        System.out.println(h.add("Developer"));     //Trying to add the duplicates. Check the reuslt. it'll be false.
        System.out.println(h);                     //Insertion order will not be preserved. check the result.
    }

}
