package Practice.November2022.DateNov30;

import java.util.Vector;

public class VectorClassDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(15,2);      //using the 3rd type of constructor
        System.out.println(vector.capacity());      //checking the intial capacity.

        for(int i = 0; i < 15; i++){
            vector.add(i);
        }
        System.out.println(vector);               //printing the vector object content.
        System.out.println(vector.capacity());

        vector.add(500);                           //adding the 16th object.
        System.out.println(vector.size());     //size should be 16 as we added 16th element.
        System.out.println(vector.capacity());      //the capacity should be incremented by 2 as specified in the constructor
    }
}
