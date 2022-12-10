package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.Collection;
import java.util.TreeSet;

public abstract class TreeSetPart2Demo {
    public static void main(String[] args) {


        TreeSet t = new TreeSet();     //this constructor follows natural default natural sorting order since no customized sorting order is specified.
      // t.add(new StringBuffer("A"));  //String buffer objects will give class cast exception.
      //  t.add(new StringBuffer("Z"));  //if we are depending on default natural sorting order, then the objects must be compulsorily "homogenous and comparable"
      //  t.add(new StringBuffer("L"));  // String buffer is not comparable. The objects are said to be "comparable" if the corresponding class is implementing the "comparable interface".
      //  t.add(new StringBuffer("B"));
      //  System.out.println(t);



    }
}
