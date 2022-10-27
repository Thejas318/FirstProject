package com.pragra.Day6;

public class ForLoop {
    public static void main(String[] args) {
        Loop(0);
    }

    public static void Loop(int i) {
        int x = 0;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}