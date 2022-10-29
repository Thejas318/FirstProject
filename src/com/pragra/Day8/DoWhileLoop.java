package com.pragra.Day8;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
    method1();
    }

    public static void method1() {

        int RandomNo = (int) (Math.random() * 10);

        int GuessedNo;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Guess the number:" );
            GuessedNo = sc.nextInt();
        }
        while (GuessedNo!=RandomNo); {

        }

        System.out.println("congratulations You Guessed It Right");


    }
}
