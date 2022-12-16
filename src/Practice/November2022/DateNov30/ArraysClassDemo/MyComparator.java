package Practice.November2022.DateNov30.ArraysClassDemo;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();

      //  return s1.compareTo(s2);     //sorts according to default natural sorting order.(Alphabetical order for Strings)
       return s2.compareTo(s1);   //Sorts according to reverse alphabetical order.
    }
}
