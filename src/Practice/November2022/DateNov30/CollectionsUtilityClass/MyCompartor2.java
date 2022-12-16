package Practice.November2022.DateNov30.CollectionsUtilityClass;

import java.util.Comparator;

public class MyCompartor2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i1.compareTo(i2);    //sorts according to the default natural sorting order (ascending order for integers)
       // return i2.compareTo(i1);     //sorts according to the reverse default natural sorting order (descending order for integers)
    }
}
