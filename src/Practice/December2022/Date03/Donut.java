package Practice.December2022.Date03;

public class Donut implements TimHortonsConsumables{
    @Override
    public void calories() {
        System.out.println("Calories per donut is 200");
    }

    @Override
    public void getprice() {
        double price  = 2.5;
        System.out.println("Cost of each donut is: " + price);
    }
}
