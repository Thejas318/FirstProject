package Practice.November2022.DateNov30.CollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Collections;

//Reverse method demo.
public class ReverseMethodDemo{

    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        System.out.println("Array list before reversing: " + l);     //insertion order is preserved

        Collections.reverse(l);       //returns the list in the reverse insertion order
        System.out.println(l);
    }
}
