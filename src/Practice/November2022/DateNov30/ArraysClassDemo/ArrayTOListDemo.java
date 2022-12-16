package Practice.November2022.DateNov30.ArraysClassDemo;

import java.util.Arrays;
import java.util.List;

//Demo program for conversion of array into list
public class ArrayTOListDemo {

    public static void main(String[] args) {
        String [] s = {"A", "J", "O"};
        System.out.println("The array of string element: ");

        for(String s1 : s){
            System.out.println(s1);
        }
        List l = Arrays.asList(s);

        System.out.println("The Array being viewed as List after conversion: " + l);

        s[0] = "K";

        System.out.println("The Array being viewed as List after changing the first element using array reference: " + l);

        l.set(1, "M");        //this operation is allowed since we are not making any changes to the size of the array using list reference.

        System.out.println("The array after using list refernce to change the 1st index element: ");
        for(String s1 : s){
            System.out.println(s1);
        }

       // l.add("Durga");                //returns unsuported operation exception since we are trying to change the size of the array.
       // l.remove("M");                 //returns unsuported operation exception since we are trying to change the size of the array.
       // l.set(1, new Integer(10));  // returns array store exception since we are trying to add heterogeneous objects using the list refernce which the array cannot store. array can only store homogenous objects.
    }
}
