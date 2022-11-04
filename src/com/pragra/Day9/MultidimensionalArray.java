package com.pragra.Day9;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] x = new int[3][5];
        int count = 5;
        for (int i = 0; i < x.length; i++) {
            //count = 0;                                 // if you want reset the count after iterating through the 2nd for loop.
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = count + j;
                                                          //System.out.println(x[i][j] + " "); //printing the array elements
            }
            count++;
        }
        for (int i = 0; i < x.length; i++) {                // looping technique to print array elements.
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
