package Practice.November2022.DateNov30.ArraysClassDemo;

import java.util.Arrays;

public class SearchMethodDemo {

    public static void main(String[] args) {
        //Demo for searching primitive type array sorted using DNSO

        int[] i = {100, 40, 30, 20, 50, 80, 60, 300};


        Arrays.sort(i);      //sorting is mandatory before binary search operation

       Integer i1 =  Arrays.binarySearch(i, 80);
        System.out.println("The index or insertion point of the above searched number is: " + i1);

        Integer i2 =  Arrays.binarySearch(i, 110);
        System.out.println("The index or insertion point of the above searched number is: " + i2);

        //Demo for searching object type array sorted using DNSO.
        String[] s = {"A", "V", "B", "R", "U", "P", "K"};
        Arrays.sort(s);        //sorting is required before using binary search.

        Integer i3 = Arrays.binarySearch(s, "K");
        System.out.println("The index or insertion point of the above searched object is: " + i3);

        Integer i4 = Arrays.binarySearch(s, "O");
        System.out.println("The index or insertion point of the above searched object is: " + i4);

        //Demo for searching object type array sorted using Customized sorting.

        String[] str = {"A", "V", "B", "R", "U", "P", "K"};
        Arrays.sort(str, new MyComparator());      //sorting is required before using binary search.
        System.out.println("Array after sorting: ");
        for(String s1 : str){
            System.out.println(s1);
        }

        Integer i5 = Arrays.binarySearch(str, "V",new MyComparator());
        System.out.println("The index or insertion point of the above searched object is: " + i5);

        Integer i6 = Arrays.binarySearch(str, "Z",new MyComparator());
        System.out.println("The index or insertion point of the above searched object is: " + i6);




    }
}
