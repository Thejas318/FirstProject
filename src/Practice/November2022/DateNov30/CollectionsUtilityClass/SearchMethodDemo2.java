package Practice.November2022.DateNov30.CollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Collections;

//Search method demo for a list sorted according to customized sorting order.
public class SearchMethodDemo2 {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add(103);
        l.add(106);
        l.add(104);
        l.add(109);
        l.add(110);
        l.add(102);
        l.add(108);

        System.out.println("Array list before sorting: " + l);       //insertion order is preserved.

        Collections.sort(l,new MyCompartor2());                             //customized sorting.
        System.out.println("Array list after customized sorting: " + l);

        Integer i = Collections.binarySearch(l, 109, new MyCompartor2());       //Search method using a customized sortind technique.
        System.out.println("The index, if the element exists or the insertion point if element is not there in the list is : " + i);

        Integer i1 = Collections.binarySearch(l, 111, new MyCompartor2());       //Search method using a customized sortind technique.
        System.out.println("The index, if the element exists or the insertion point if element is not there in the list is : " + i1);

    }
}
