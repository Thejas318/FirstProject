package com.pragra.Day8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        method2(); // You can call method1 or method2.

    }

    public static void method1() {


        int RandomNo = (int) (Math.random() * 10);
         //generating a random number


        System.out.println("I have a number in my mind..  Try guessing it");


        Scanner sc = new Scanner(System.in);
        while (true) {
            int GuessedNo = sc.nextInt();

            if (GuessedNo == RandomNo) {
                System.out.println("You wonn!!.... You guessed it right");
                break;
            } else {
                System.out.println("wrong answer.... try again");

            }

        }
    }


    public static void method2() {
        int RandomNo = (int) (Math.random() * 10); //generating a random number


        System.out.println("I have a number in my mind..  Try guessing it");


        Scanner sc = new Scanner(System.in);
        int Guessedno = sc.nextInt();

        while(Guessedno != RandomNo){
            System.out.println("wrong guess.. try again");
            Guessedno = sc.nextInt();
        }
        System.out.println("You guessed it right!! Congratulation!!");

    }
}