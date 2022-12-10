package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.TreeSet;

public class ComparatorInterfaceDemo2 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparatorDemo2());

        t.add("Bharathi");
        t.add("Madhu");
        t.add("Yashu");
        t.add("Sowmya");
        t.add("Shreya");
        System.out.println(t);
    }
}
