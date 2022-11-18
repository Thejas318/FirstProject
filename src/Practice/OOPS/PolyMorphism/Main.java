package Practice.OOPS.PolyMorphism;

import Practice.OOPS.Access.Hiding;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Square square = new Square();
        Shape shape1 = new Square();
        shape1.area();               //this will call the method from square class instead of shape class according to our previous understanding.
    }                                  // this happens bcoz of method overriding. when the parent class and child class have the same method with diff body,
}                                     //    the method from child class will be called since the actual object belongs to child class. this is called overriding.
                                      //"overriding" happens only when the "ref variable" type is of the parent class and the "object" is of the type "child class"
                                     //upcasting and overriding.
