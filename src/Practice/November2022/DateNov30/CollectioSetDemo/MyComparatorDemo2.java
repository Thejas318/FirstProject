package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.Comparator;

public class MyComparatorDemo2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;     //or typecasting could be done like below also
        String s2 = o2.toString();

      //  return s1.compareTo(s2);     // sorts the strings in alphabetical order
      //  return -s1.compareTo(s2);    // sorts the strings in reverse alphabetical order

        return s2.compareTo(s1);      // sorts the strings in reverse alphabetical order
    }
}
