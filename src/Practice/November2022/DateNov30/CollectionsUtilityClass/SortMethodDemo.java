package Practice.November2022.DateNov30.CollectionsUtilityClass;

//Demo program for sorting the arraylist using default natural sorting order

import java.util.ArrayList;
import java.util.Collections;

public class SortMethodDemo {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add("A");
        arr.add("F");
        arr.add("W");
        arr.add("T");
        arr.add("H");
        arr.add("P");
     //   arr.add(new Integer(10));          //for sorting objects in arraylist should be homogenous and comparable. return class cast exception
     //   arr.add(null);                      //for sorting objects in arraylist should not contain null. null cannot be compared. returns null pointer exception.

        System.out.println("The arraylist before sorting: " + arr);     //Insertion order is prserved in list objects.

        Collections.sort(arr);                                          //sort method present in collctions utility class.

        System.out.println("The arraylist after sorting using sort method: " + arr);
    }


}
