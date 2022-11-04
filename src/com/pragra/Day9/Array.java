package com.pragra.Day9;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] x = new int[25];
        for(int i =0; i<25; i++){
            x[i] = i;
        }
        for(int i =0; i<25; i++) {          //One way to print the content of the array.
            System.out.println(x[i]);
        }
        System.out.println(Arrays.toString(x)); //Array utility to display the content of the array - 'stringify'
                                                 //Arrays.toString(x)

    }


}
