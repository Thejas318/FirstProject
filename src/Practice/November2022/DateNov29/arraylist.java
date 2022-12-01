package Practice.November2022.DateNov29;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList(5);     //arraylist can store objects. it can store different types at once if not specified.
        arrayList.add("Hello");          //string datatype
        arrayList.add(5);               //integer
        arrayList.add('i');             //character
        System.out.println(arrayList);          //arraylist here is storing string and an integer type.
                                        // but this will give runtime error if you try to fetch it. //refer this article // https://www.geeksforgeeks.org/generics-in-java/

        ArrayList<String> stringlist = new ArrayList<String>(5);

        stringlist.add("Hello");
        stringlist.add("bye");
        stringlist.add("coder");
        stringlist.add("java");
        stringlist.add("jenkins");
        stringlist.add("github");

       // stringlist.add(5);             //since string is specified it cannot store integer. it'll give mismatch error.
        System.out.println(stringlist);
     

        String s1 = (String) arrayList.get(0);   //if generics are not used then typecasting is a big problem while retrieving.
        System.out.println(s1);
    }
}
