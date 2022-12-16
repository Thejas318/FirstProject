package Practice.November2022.DateNov30.CollectionsUtilityClass;



import java.util.ArrayList;
import java.util.Collections;

//Demop program of SearchMethod for a list sorted using default natural sorting order.
public class SearchMethodDemo {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("X");
        l.add("F");
        l.add("A");
        l.add("Z");
        l.add("M");
        l.add("K");

        System.out.println("Arraylist before sorting" + l);

        Collections.sort(l);                         //list should be sorted before calling binary search method else the results will bwe unpredictable. Comment this line to verify.
        System.out.println("Arraylist after sorting" + l);

        Integer i = Collections.binarySearch(l,"F");    //returns the index of F since it is there in the list
        System.out.println("The index if the element exists or the inserion point if element is not there in the list is : " + i);    //the list should be sorted before calling binary search method. else the results will be unpredictable.

        Integer i1 = Collections.binarySearch(l,"X");       //returns the index of X since it is there in the list
        System.out.println("The index if the element exists or the inserion point if element is not there in the list is : " + i1);

        Integer i2 = Collections.binarySearch(l,"B");       //returns the insertion point of B since it is there in the list
        System.out.println("The index if the element exists or the inserion point if element is not there in the list is : " + i2);
    }


}
