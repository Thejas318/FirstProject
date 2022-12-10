package Practice.December2022.Date03;

public class Sandwich implements TimHortonsConsumables{
    @Override
    public void calories() {
        System.out.println("Calories per sandwich is 300");
    }

    @Override
    public void getprice() {
        double price  = 6.00;
        System.out.println("Cost of each sandwich is: " + price);
    }
}
