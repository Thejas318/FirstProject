package Practice.November2022.DateNov30.MAPS;

//Demo program to show the Navigable Methods.
import java.util.*;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {
        TreeMap<String, String> t = new TreeMap<String, String>();

        t.put("A", "Apple");
        t.put("G", "Google");
        t.put("O", "Oracle");
        t.put("Z", "Zebra");
        t.put("S", "Samsung");
        t.put("R", "Reliance");

        System.out.println("The treemap in the default natural sorting order is : " + t);

        String s = t.floorKey("O");        //returns the highest key less than or equal to "O"
        System.out.println("returns the highest key less than or equal to O: " + s);

        String s1 = t.lowerKey("O");       //returns the highest key less than to "O"
        System.out.println("the highest key less than to O: " + s1);

        String s2 = t.ceilingKey("G");       //returns the lowest key greater than or equal to "G"
        System.out.println("the lowest key greater than or equal to G: " + s2);

        String s3 = t.higherKey("G");       //returns the lowest key greater than to "G"
        System.out.println("returns the lowest key greater than to G: " + s3);

        t.pollFirstEntry();
        System.out.println("The Treemap after using pollfirstentry() method" + t);

        t.pollLastEntry();
        System.out.println("The Treemap after using polllastEntry() method" + t);

        System.out.println("The treemap after using descendingMap() method: " + t.descendingMap());

        //Another way of doing the same descending method.
        NavigableMap t1 = (NavigableMap) t.descendingMap();  //descending map returns navigable map. so we have to cast it.
        System.out.println("TreeMap after using descending Map method: " + t1);

        System.out.println( "The descending key set : " + t.descendingKeySet());


    }
}
