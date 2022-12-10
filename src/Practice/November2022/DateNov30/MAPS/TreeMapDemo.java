package Practice.November2022.DateNov30.MAPS;
// Demo program for default natural sorting order.


import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap t = new TreeMap();

        t.put(100, "ABC");
        t.put(99, "BCD");
        t.put(105, "CAB");
        t.put(101, "JKL");
        t.put(110, "IOP");



        System.out.println("original tree map: " + t);   //prints the entries in default natural sorting order.

      //  t.put("XYZ", 105);  //This will give class cast exception since heterogenous keys are not allowed but values are allowed though.

     //   t.put(null, "TGB");  //this will give null pointer exception since in a non empty tree map null is not accepted.

          t.put(115, 106); //heterogenous values are allowed in treemap

        System.out.println("updated tree map: " + t);  //prints the updates tree map
    }
}
