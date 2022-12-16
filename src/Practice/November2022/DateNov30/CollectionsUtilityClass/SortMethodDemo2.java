package Practice.November2022.DateNov30.CollectionsUtilityClass;
//De3mo program for customized sorting of the arraylist objects using sort method of collections class

import java.util.ArrayList;
import java.util.Collections;

public class SortMethodDemo2 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("G");
        arr.add("A");
        arr.add("W");
        arr.add("F");
        arr.add("T");
        arr.add("H");
        arr.add("P");

        System.out.println("Before sorting: " + arr);

        Collections.sort(arr,new MyComparator());      //sorting according to the customized sorting order defined in myComparator class.

        System.out.println("the arraylist after sorting: " + arr);

    }

}
