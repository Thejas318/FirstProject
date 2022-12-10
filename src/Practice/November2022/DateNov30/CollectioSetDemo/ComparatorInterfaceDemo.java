package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.TreeSet;

//Demo for creating our sorting method using Comparator interface and compare method present in Comparator interface.
public class ComparatorInterfaceDemo {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());

        t.add(25);
        t.add(0);
        t.add(10);
        t.add(13);
        t.add(17);
        t.add(17);
        System.out.println(t);
    }
}
