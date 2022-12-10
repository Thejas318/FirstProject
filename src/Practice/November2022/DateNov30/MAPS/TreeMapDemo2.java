package Practice.November2022.DateNov30.MAPS;

//Demo program for customized sorting in treemap

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {

        TreeMap t = new TreeMap(new MyComparator());

        t.put("AAA", 110);
        t.put("XXX", 210);
        t.put("NNN", 310);
        t.put("OOO", 451);
        t.put("ZZZ", 560);

        System.out.println(t);
    }
}
