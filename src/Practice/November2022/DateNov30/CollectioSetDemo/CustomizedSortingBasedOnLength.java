package Practice.November2022.DateNov30.CollectioSetDemo;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedSortingBasedOnLength {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparatorInterfaceStringLengthSorting());

        t.add("ThejasGowda");
        t.add("Sriram SV");
        t.add("Bhawin");
        t.add(new StringBuffer("Dhananjay"));
        t.add(new StringBuffer("Tharun"));
        t.add("Harsha");
        t.add("Nayak");
        t.add("A");
        t.add("AB");
        t.add("ABC");
        t.add("BCD");
        t.add("ABCD");

        System.out.println(t);
    }
}
