package Practice.November2022.DateNov30.MAPS;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();

      //  return s1.compareTo(s2);     //default natural sorting order.
        return s2.compareTo(s1);     //reverse of default natural sorting order.

    }
}
