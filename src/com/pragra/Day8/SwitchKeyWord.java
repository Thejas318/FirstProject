package com.pragra.Day8;

import java.util.Scanner;

public class SwitchKeyWord {

    public static void main(String[] args) {       //Method 1 without merging the cases.
        method1();
        //method2();                                   // use any method available in the class.
    }

    public static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int MonthNo = sc.nextInt();

        switch (MonthNo) {

            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Month Number");

        }

    }

    public static void method2() {        // Method 2 where we are merging the cases if they're giving the same output.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int MonthNo = sc.nextInt();


           switch (MonthNo){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid Month Number");

        }

    }


}


