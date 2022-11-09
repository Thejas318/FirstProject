package com.pragra.Day9;

import java.util.Arrays;
import java.util.Random;

public class ArrayQuestion {

    public static void main(String[] args) {
        int[] marks = new int[5];
       TotalMarks(marks);
        System.out.println(Arrays.toString(marks));

    }

    public static int[] TotalMarks(int[] args) {      //This method populates the array with random numbers using Random class.
        Random r = new Random();
        for(int i = 0; i < args.length; i++){         // if we use marks.length, it'll be difficult to this method for any other array.
            args[i] = r.nextInt(25);           //  then we have to change the length method accordingly. instead we can make it dynamic by using 'args'.
        }

        return args;
    }

}
