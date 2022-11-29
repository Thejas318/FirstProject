package com.pragra.Day12;

import com.pragra.Day8.SwitchKeyWord;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String option;
        Scanner obj = new Scanner(System.in);
        do {


            System.out.println("enter 2 numbers: ");
            int x = obj.nextInt();
            int y = obj.nextInt();
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("enter the number to perform the operation: ");
            int perform = obj.nextInt();


            switch (perform) {

                case 1:
                    add(x, y);

                    break;

                case 2:
                    sub(x, y);
                    break;

                case 3:
                    multiply(x, y);
                    break;

                case 4:
                    if (y == 0){
                        System.out.println("y cannot be zero");
                        break;
                    }
                    else{
                        divide(x, y);
                        break;
                    }
                default:
                    System.out.println("Please enter a number from 1 to 4");


            }
            System.out.println("If you want to perform the operation further type *Y*. To exit Type *N*");
            option = obj.next();
        }
        while (option.equalsIgnoreCase("y"));

    }

    public static void add(int a, int b) {
        System.out.println( a + b);

    }

    public static void sub(int a, int b) {
        System.out.println( a - b);
    }
    public static void multiply(int a, int b) {
        System.out.println( a * b);
    }

    public static void divide(int a, int b) {
        System.out.println( a / b);

    }
}
