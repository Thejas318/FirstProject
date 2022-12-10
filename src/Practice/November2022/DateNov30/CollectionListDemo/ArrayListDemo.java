package Practice.November2022.DateNov30.CollectionListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo  {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("hello");
        al.add(25.0);
        al.add("hello");
        al.add(null);


        System.out.println(al);

        al.remove(2);
        System.out.println(al);

        al.add(2,"hello my friend");
        System.out.println(al);

        al.add(101.80);
        System.out.println(al);

        al.add(1, "new");
        System.out.println(al);

    }
}
