package Practice.November2022.DateNov30.CollectionsQueue;

import java.util.Comparator;

public class MyComparator1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {


       String s1 = o1.toString();
       String s2 = o2.toString();
        return s2.compareTo(s1);    //sorts in reverse alphbetical order

    }
}
