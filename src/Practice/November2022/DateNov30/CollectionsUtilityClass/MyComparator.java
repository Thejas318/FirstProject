package Practice.November2022.DateNov30.CollectionsUtilityClass;

import java.util.Comparator;

public class MyComparator implements Comparator {



    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s1.compareTo(s2);      //sorts according to the default natural sorting order (alphabetical order for strings)
      //   return s2.compareTo(s1);       // sorts according to the reverse default natural sorting order (reverse alphabetical order for strings)
    }
}
