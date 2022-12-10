package Practice.November2022.DateNov30.CollectionListDemo;

import java.util.Stack;

public class StackClassDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("Thejas");
        stack.add("Gowda");
        stack.add(24);
        stack.add("Developer");

        System.out.println(stack);

        System.out.println("checking what we have on top of stack");
        Object n = stack.peek(); //checks what is there at top of stack.
        System.out.println(n);

        int m = stack.search("Developer");  //returns offset of the stack it the object is available. -1 if not.
        System.out.println(m);
        System.out.println("returns offset of the stack it the object is available. -1 if not.");

       int o = stack.search("Hey");
        System.out.println(o);
    }
}
