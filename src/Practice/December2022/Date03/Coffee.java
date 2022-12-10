package Practice.December2022.Date03;

public class Coffee implements TimHortonsConsumables {

    @Override
    public void calories() {
        System.out.println("Calories per coffee is 115");
    }

    @Override
    public void getprice() {
        double price  = 2.80;
        System.out.println("Cost of each coffee is: " + price);
    }
}
