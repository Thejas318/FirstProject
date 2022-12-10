package Practice.November2022.DateNov30.HashTableDemo;

import java.util.Hashtable;

public class HashtableDemo1 {

    public static void main(String[] args) {

        Hashtable h = new Hashtable();
        h.put(new Temp(5), "A");
        h.put(new Temp(9), "B");
        h.put(new Temp(15), "C");
        h.put(new Temp(23), "D");
        h.put(new Temp(16), "E");
        h.put(new Temp(11), "F");


        System.out.println(h);  // check the notes of hashtable by durga sir to understand how the hashtable stores the data and returns the data.
                                // Check temp class, overridden hashcode method to predict the printing order of entries.

    }
        }
