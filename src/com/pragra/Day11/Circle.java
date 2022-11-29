package com.pragra.Day11;

public class Circle {
    double radius = 3;
    public static final double pi = 3.14;        //always make the static variables as final. they are shared with all the objects. so better to make them final.


    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(5));
        System.out.println(obj.circumference(6.0));

    }

    public double area(double radius) {
        this.radius = radius;
        double area =  pi * radius * radius;
       return area;
    }
    public double circumference(double radius) {
        this.radius = radius;
        double circumference = 2 * pi * radius;
        return circumference;
    }

}
