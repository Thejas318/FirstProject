package Practice.January2023.Java8Enhancements.Jan6th;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator cal = (a, b) ->  a+b;    //providing implementation to the interface
    //    doMath(cal);

        doMath((a,b) -> {
            if (a > 0 ){
                a++;
            }
            return a+b;
        });


        //Let's try another feature of lambda.
        List<String> data = Arrays.asList("Tom", "Cat", "Bunny");
        data.forEach((a) -> System.out.println(a));      // printing the list.
    //    data.sort((a,b) -> a.compareTo(b));           //for printing the sorted list for the above list.
   //     System.out.println(data);                  //printing the sorted data.


        data.sort(String :: compareTo);     //2nd method for sorting the data. this is a enhanced feature of java 8. (syntax is:  Class name :: method)
        System.out.println(data);          // the above method is called method referencing.
        }


    public static void doMath(Calculator obj){
        System.out.println(obj.calculate(5, 5));

    }
}
