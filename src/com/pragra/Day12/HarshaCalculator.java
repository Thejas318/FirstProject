package com.pragra.Day12;
import java.util.Scanner;
import com.pragra.Day8.SwitchKeyWord;

public class HarshaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String run;

        do {


            System.out.println("Enter two numbers");

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter 1 for addition,2 for subtraction, 3 for multiplication, 4 for devision");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    add(a, b);

                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mult(a, b);
                    break;
                case 4:
                    if (a == 0 || b == 0) {
                        System.out.println("Since one of the operand is zero operation cannot be performed ");
                        break;
                    }
                    div(a, b);
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("DO you want to exit or do any operation agin press Y/n");
            run = sc.next();

        }
        while (run.equalsIgnoreCase("y"));

    }

    public static void add(int a, int b) {
        System.out.println("addition of number " + a + "and " + b + " is " + (a + b));
    }

    public static void sub(int a, int b) {

        System.out.println("Subtraction of number " + a + "and " + b + " is " + (a - b));

    }

    public static void mult(int a, int b) {
        System.out.println("Multiplication of number " + a + "and " + b + " is " + (a * b));
    }

    public static void div(double a, double b) {
        System.out.println("Division of number " + a + "and " + b + " is " + (a / b));
    }
}

