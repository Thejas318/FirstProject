package Practice;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class Febraury04practice {

    public static void main(String[] args) throws IOException {
        int z = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter q");
        int q = sc.nextInt();


        while (z <= q) {
            int y = 0;

            System.out.println("Enter a");
            int a = sc.nextInt();

            System.out.println("Enter b");
            int b = sc.nextInt();

            System.out.println("Enter n");
            int n = sc.nextInt();

            System.out.println(q + "," + a + "," + b + "," + n);

            y = a + b;
            System.out.print(y);
            System.out.print(",");
            for (double m = 1; m < n; m++) {
                double x = Math.pow(2, m);
                y = (int) (y + (x * b));

                System.out.print(y);
                System.out.print(",");


            }
            System.out.println(" ");
            z++;
        }


    }
}