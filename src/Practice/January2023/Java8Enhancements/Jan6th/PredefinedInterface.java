package Practice.January2023.Java8Enhancements.Jan6th;

import java.util.Date;
import java.util.function.*;


public class PredefinedInterface {

    public static void main(String[] args) {

     //   String str = "Thejas";

        // Function Interface
        Function<String, Integer> function = (p) -> p.length();
        System.out.println(function.apply("thejas"));

        //Predicate Interface
        Predicate<String> predicate = (s) -> s.length() > 10;
        System.out.println(predicate.test("I am learning java"));

        //Converting a string to an Integer
        System.out.println("Converting a string to an Integer");
        Function<String, Integer> fun = (s) -> Integer.parseInt(s);        // This can be simply written as "Function<String, Integer> fun = Integeer::parseInt;
        Integer x = fun.apply("100");
        System.out.println(x + 50);


        //Consumer
        System.out.println("trying consumer interface");
        Consumer<String> consumer = (s) -> System.out.println(s);             // This can be simply written as " Consumer<String> consumer = System.Out::println;
        consumer.accept("I am trying the functionality of consumer interface");

        //Biconsumer
        System.out.println("Biconsumer");
        BiConsumer<String, String> bicon = (s, u) -> System.out.println(s + " // " + u);   // This can be simply written as "  BiConsumer<String, String> bicon = PredefinedInterface::myMethod;
        bicon.accept("Java", "Python");

        System.out.println();    //to print an empty line.
        System.out.println("Trying biconsumer in method reference");
        BiConsumer<String, String> bicon1 = PredefinedInterface::myMethod;
        bicon1.accept("ML", "AI");


        //Supplier. This interface gets a result and returns the result but takes nothing.
        System.out.println();
        System.out.println("trying supplier interface");
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }

    public static void myMethod(String a, String b){
        System.out.println(a + " // " + b);
    }

    }




