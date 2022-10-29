package com.pragra.Day8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        int RandomNo = (int) (Math.random() * 100);


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
}