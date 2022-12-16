package Practice.November2022.DateNov30.ArraysClassDemo;

import java.util.Arrays;

public class SortingMethodDemo1 {
    public static void main(String[] args) {
        //Demo for sort method primitives
        int[] a = {10,5,20,11,6};


        System.out.println("Primitive array before sorting: ");
        for (int a1 : a){
            System.out.println(a1);
        }

        Arrays.sort(a);
        System.out.println("Primitive Array after sorting: ");
        for(int a1: a){
            System.out.println(a1);
        }
        //Demo for sort method objects using default natural sorting order

        String[] s = {"Y","A", "H", "M", "Q", "Z"};
        System.out.println("String object array before sorting: ");
        for(String s1 : s){
            System.out.println(s1);
        }
        Arrays.sort(s);
        System.out.println("String object array after sorting: ");
        for(String s1 : s){
            System.out.println(s1);
        }

        //Demo for sort method objects using customized sorting order.
        String[] str = {"Y","A", "H", "M", "Q", "Z"};
        System.out.println("String object array before sorting using customized sorting order: ");
        for(String s1 : str){
            System.out.println(s1);
        }
        Arrays.sort(str, new MyComparator());
        System.out.println("String object array after sorting using customized sorting order: ");
        for(String s1 : str){
            System.out.println(s1);
        }


    }
}
