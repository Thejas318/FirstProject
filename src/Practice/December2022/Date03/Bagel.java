package Practice.December2022.Date03;

public class Bagel implements TimHortonsConsumables{
    @Override
    public void calories() {
        System.out.println("Calories per bagel is 250");
    }

    @Override
    public void getprice() {
        double price  = 3.0;
        System.out.println("Cost of each bagel is: " + price);

    }
}
