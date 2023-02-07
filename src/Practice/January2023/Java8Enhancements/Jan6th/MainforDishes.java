package Practice.January2023.Java8Enhancements.Jan6th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainforDishes {

/*
    private String dishname;
    private int calories;
    private List<String> ingredients;
    private Dishtype dishtype;

*/
    public static void main(String[] args) {

        List<Dishes> dishes = new ArrayList<>();
        dishes.add(new Dishes("Pizza", 400, Arrays.asList("Pizza Base", "Pizza Sauce", "vegetables", "Cheese"), Dishtype.Veg));
        dishes.add(new Dishes("Pasta", 600, Arrays.asList("Pasta", "Pasta Sauce", "vegetables", "Cheese", "Celery"), Dishtype.Veg));
        dishes.add(new Dishes("Biryani", 300, Arrays.asList("Rice", "chicken", "Spices", "Coriander"), Dishtype.Non_Veg));
        dishes.add(new Dishes("Kabab", 250, Arrays.asList("Mutton", "Oil", "kabab Powder"), Dishtype.Non_Veg));
        dishes.add(new Dishes("Dose", 150, Arrays.asList("Dosa Batter", "Potato", "Chutney"), Dishtype.Veg));
        dishes.add(new Dishes("Pizza", 400, Arrays.asList("Pizza Base", "Pizza Sauce", "vegetables", "Cheese"), Dishtype.Veg));    //Duplicate
        dishes.add(new Dishes("Kabab", 250, Arrays.asList("Mutton", "Oil", "kabab Powder"), Dishtype.Non_Veg));                    //Duplicate

        System.out.println("Dishes with calories more then or equal to 300");
        Stream<Dishes> dishStream = dishes.stream();                                       //converting the collection object dishes into stream
                                                                                         //to find the food which has more than or equals to 300 calories.
        Stream<Dishes> dishesStream = dishStream.filter((d) -> d.getCalories() >= 300);  // here we will get the stream of dishes which has more than 300 calories in them.

        dishesStream.forEach((s) -> System.out.println(s));                               //after recieving the stream of dishes which has more than 300 calories, we are just printing them.

        System.out.println();
        System.out.println("Dishes with calories less then 300");
        // the above 3 lines of code can be together written in one single line as shown below.
        dishes.stream().filter((d) -> d.getCalories() < 300).forEach((s) -> System.out.println(s));
        System.out.println();


       //to print the dishes which are unique (There is no duplicate)
        System.out.println("To print only the distinct dishes with calories less than 300. No Duplicates allowed");
        dishes.stream().filter((d) -> d.getCalories() < 300).distinct().forEach((s) -> System.out.println(s));       //for distinct method to work, our "Dishes" class should have overridden "the equals" and "hashcode method".
        System.out.println();


       //Using some other terminatory methods.
        System.out.println(" Using some other terminatory methods. ");
        List<Dishes> processedList = dishes.stream().filter((d) -> d.getCalories() < 300).distinct().collect(Collectors.toList());  //collectors.toList() method will return list of dishes that is filtered and distinct.
        System.out.println(processedList);
        System.out.println();


        //printing the list of name of the dishes with calories more than 300
        System.out.println("Printing the list of name of the dishes with calories more than 300");
        List<String> processedDishName = dishes.stream()
                .filter((d) -> d.getCalories() > 300)
                .map((d) -> d.getDishname())
                .collect(Collectors.toList());

        System.out.println(processedDishName);
        System.out.println();


        //setting the name of all the dishes with calories more 500 as Unhealthy food.
        System.out.println("setting the name of all the dishes with calories more 500 as Unhealthy food.");
        List<Dishes> processedChangedDishName = dishes.stream()
                .filter((d) -> d.getCalories() > 300)
                .map((d) -> {d.setDishname("Unhealthy"); return d;})       //whenever there are more than 1 line in  lambda use curly braces and semicolon.
                .collect(Collectors.toList());

       processedChangedDishName.forEach( System.out::println);    //printing everything in separate line.
        System.out.println();


        //Reduce Function. // reduce function is very useful for performing any mathematical operation on integers.
        System.out.println("Trying the functionality of the Reduce Function");
        List<Integer> num = Arrays.asList(2, 4, 6, 13, 15, 16, 18, 21, 15, 30, 36, 40, 43, 48, 52, 53, 56);
        System.out.print("The sum of all the given numbers is: ");
        Integer op = num.stream().filter(a -> (a % 2) == 0).reduce(0, (a, b) -> (a + b));
        System.out.println(op);
        System.out.println();

        System.out.print("The product of all the given numbers is: ");
        List<Integer> num1 = Arrays.asList(2, 4);
        Integer op1 = num1.stream().filter(a -> (a % 2) == 0).reduce(1, (a, b) -> (a * b));
        System.out.println(op1);
        System.out.println();

        System.out.print("The division of all the given numbers is: ");
        List<Integer> nu = Arrays.asList(2, 4);
        double op2 = nu.stream().filter(d -> (d % 2) == 0).mapToDouble(c -> c).reduce(4, (a, b) -> {
            return (a / b);
        });
        System.out.println(op2);
        System.out.println();





    }
}
