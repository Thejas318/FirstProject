package Practice.December2022.Date03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String [] price = new String[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        String str;
        int counter = 0;

            do {
                System.out.println("Enter 1 to shop the timhortons merchendise, 2 for timHortons consumables");
                int opt = obj.nextInt();

                if(opt == 1){
                System.out.println("The tim hortons merchendise are listed below");
                System.out.println("select 1 for mug");
                System.out.println("select 2 for coffee powder");
                System.out.println("select 3 for gift card");

                    int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        Mug mg = new Mug();
                        mg.getfeature();
                        mg.getprice();
                        price[counter] = "5";
                        counter++;
                        break;

                    case 2:
                        CoffeePowder cp = new CoffeePowder();
                        cp.getfeature();
                        cp.getprice();
                        price[counter] = "10";
                        counter++;

                        break;

                    case 3:
                        GiftCard gc = new GiftCard();
                        gc.getfeature();
                        gc.getprice();
                        price[counter] = "50";
                        counter++;
                        break;
                }
                }
                else if (opt == 2){
                    System.out.println("The tim hortons consumables are listed below");
                    System.out.println("select 1 for Donut");
                    System.out.println("select 2 for bagel");
                    System.out.println("select 3 for coffee");
                    System.out.println("select 4 for wrap");
                    System.out.println("select 5 for sandwich");

                    int choice = sc.nextInt();      //testing whether we can use the same scanner object

                    switch(choice){

                        case 1:
                            Donut dt = new Donut();
                            dt.calories();
                            dt.getprice();
                            price[counter] = "2.5";
                            counter++;
                            break;

                        case 2:
                            Bagel bg = new Bagel();
                            bg.calories();
                            bg.getprice();
                            price[counter] = "3.0";
                            counter++;
                            break;

                        case 3:
                            Coffee cf = new Coffee();
                            cf.calories();
                            cf.getprice();
                            price[counter] = "2.80";
                            counter++;
                            break;

                        case 4:
                            Wrap wp = new Wrap();
                            wp.calories();
                            wp.getprice();
                            price[counter] = "8.0";
                            counter++;
                            break;

                        case 5:
                            Sandwich sd = new Sandwich();
                            sd.calories();
                            sd.getprice();
                            price[counter] = "6.0";
                            counter++;
                            break;
                    }

                }
                System.out.println("Do you want to select anything else. select Y/N");
                str = sc1.nextLine();
            }
            while (str.equalsIgnoreCase("Y"));

        System.out.println(Arrays.toString(price));

    }

}
