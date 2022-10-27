package com.pragra.day4;

public class sum
{
    public static void main(String[] args)
    {
      int a = 5;
      int b = 10;
      int sum = a+b;
        System.out.println("The sum is : "+ sum);


        //Invoking the method which is written the main method//
        int i = second(5, 10);
        System.out.println("The result is: " + i);
    }

    public static int second(int c, int d)
    {

        return c+d;

    }

}


