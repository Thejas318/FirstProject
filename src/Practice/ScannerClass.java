package Practice;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name: ");
        String name = sc.nextLine();
        System.out.println("what is your age: ");
        int age = sc.nextInt();
        System.out.println("Hey " + name + " you are already " + age);


    }
}
