package Practice.December2022.Date03;

public class CoffeePowder implements MerchendiseCommonMethods{


    @Override
    public void getfeature() {
        System.out.println("Tim Hortons original blend coffee");
    }

    @Override
    public int getprice() {
        int cost = 10;
        System.out.println("the price of coffe powder is $10 for 1 lbs");
        return cost;
    }
}
