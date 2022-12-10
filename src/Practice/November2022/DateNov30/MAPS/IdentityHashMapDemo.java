package Practice.November2022.DateNov30.MAPS;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

//Demo of difference between hashmap and identity hashmap
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

         h.put(i1, "Sampath");      //incase of hahmap JVM uses .equals() method to check for duplicates. duplicate keys are not allowed in hashmap.
         h.put(i2, "Sarthak");      // here i1 and i2 are duplicate keys. coz .equals() method returns true since the content is same. thus sampath will be replaced by sarthak in i1.
        System.out.println("hashmap: " + h );

        IdentityHashMap h1 = new IdentityHashMap();

        h1.put(i1, "sampath");          //the difference btw HM and identity HM is that, IHM uses "==" operator to check the duplicates. thus i1 andi2 are not equal and allows both to be inserted into the identity hashmap.
        h1.put(i2, "sarthak");        //except this it is exactly same has hashmap.
        System.out.println("Identity hash map: " + h1);
    }
}
