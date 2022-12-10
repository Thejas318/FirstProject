package Practice.December2022.Date03;

public class Mug implements MerchendiseCommonMethods{



    @Override
    public void getfeature() {
        System.out.println("Red and Black Tim hortons logo mug");
    }

    @Override
    public int getprice() {
        int cost = 5;
        System.out.println("The cost of the mug is : $5");
        return cost;
    }
}
