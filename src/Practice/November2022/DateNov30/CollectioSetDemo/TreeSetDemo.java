package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
       // t.add(null);     //for an empty treeset as a first and only element null is allowed.
        t.add("A");      //unicode is 65.
        t.add("a");      //unicode in 97. bigger than 'A'
        t.add("C");
        t.add("Z");
        t.add("L");

      //  t.add(65);  //this will give runtime exception (class cast exception) beacuse heterogenous objects are not allowed in Treeset.
     //   t.add(null); //null pointer exception bcoz we are trying to add null to the non empty treeset.

        System.out.println(t);

    }
}
