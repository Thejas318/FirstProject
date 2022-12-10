package Practice.November2022.DateNov30.MAPS;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap m = new HashMap();

        m.put("Sampath", 40161223);
        m.put("Sriram", 40161645);
        m.put("Bhawin", 401617554);
        m.put("Srinath", 40141820);
        m.put("Sagar", 40165523);

        System.out.println(m);

        System.out.println(m.put("Sagar", 40158963));   //this will replace the value of sagar to new value. along with that it will return the old value which we are trying to print.

        System.out.println( "printing the updated hashmap:  "+ m);   //printing the updated map object after changing the sagar value.

        Set s = m.keySet();         //printing only the keys of the hashmap object. method returns set object. thus assigning it to the set type variable.
        System.out.println("Printing only the keys of the hashmap: " + s);

        Collection v = m.values();//printing the values of the hashmap. method returns collections thus assignening them to collection type variable.
        System.out.println("Printing only the keys of the hashmap: " + v);

        Set s1 = m.entrySet()  ;    //printing the whole hashmap(Entries)
        System.out.println( "Printing the entries of the hashmap: "+ s1);

        //Demo for usage of entry methods//
        // now s1 stores the key-value entries as set objects.

        Iterator itr = s1.iterator(); //creating an iterator object to retrieve the entries in set (collection type) s1 one by one.

        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();  //next method return an object. typecasting that to map.entry type so that we can use entry methods on that object.

            System.out.println("usage of entry methods to retrieve keys and values: " + m1.getKey() + "....." + m1.getValue());       //usage of entry methods to print keys and values of the entries.
            if(m1.getKey().equals("Srinath")){
                m1.setValue(40129988);              //replacing the values of the keys using set method of entry interface
            }
        }
        System.out.println("The updated hashmap object after the usage of entry methods " + m);

    }
}
