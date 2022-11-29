package com.pragra.Day12;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(
                "4875, Edouard Montpetit boulevard",
                "Montreal , quebec, canada",
                "H3W 1P7");

        Employee employee = new Employee(
                101,
                "Thejas",
                "Gowda",
                "Java Developer",
                "4388559093",
                address);

        System.out.println(employee);

    }


}
