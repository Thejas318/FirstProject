package com.pragra.Day11;

public class Stringbuilderpractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("thejas");
        sb.append("gowda");
        System.out.println(sb);

        String s = "Hey";
        s = s.concat("good morning"); //read how this works.
        System.out.println(s);
    }
}
