package Practice.December2022.Date03;

public class Wrap implements TimHortonsConsumables{
    @Override
    public void calories() {
        System.out.println("Calories per wrap is 300");
    }

    @Override
    public void getprice() {
        double price  = 8.00;
        System.out.println("Cost of each wrap is: " + price);
    }
}
