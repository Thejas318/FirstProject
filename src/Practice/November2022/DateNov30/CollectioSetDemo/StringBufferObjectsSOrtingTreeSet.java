package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.TreeSet;

public class StringBufferObjectsSOrtingTreeSet {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparatorInterfaceforStringBufferSorting());

        t.add(new StringBuffer("Yashu"));
        t.add(new StringBuffer("Madhu"));
        t.add(new StringBuffer("yashu"));
        t.add(new StringBuffer("Bharathi"));
        t.add(new StringBuffer("Sowmya"));

        System.out.println(t);

    }
}
