package Practice;


import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        substr();// Calling a method inside psvm

    }
    //Substring Usage method

    public static void substr() {
        String greeting = "Garden ";           // Creating a string object
        String x = greeting.substring(0, 2);       //Using a substring method
        System.out.println(x);
        System.out.println(greeting.charAt(4));
        System.out.println(greeting.substring(3,6));
        System.out.println("The index of the last character passed is: " + greeting.lastIndexOf('d'));  //usage of the lastindexof method
       greeting.concat("of roses");  //applying string method doesnot change the original string object. coz strings are immutable.
        System.out.println(greeting);



    }


}
