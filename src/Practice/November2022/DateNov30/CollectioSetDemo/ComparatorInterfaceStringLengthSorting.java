package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.Comparator;
// sorts string according to length of string. if length is same then sorts based on alphabetical order
public class ComparatorInterfaceStringLengthSorting implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

      int  l1 = s1.length();
        int l2 = s2.length();

        if(l1 < l2)
            return -1;
        else if(l1 > l2)
            return +1;
        else
            return s1.compareTo(s2);
    }
}
