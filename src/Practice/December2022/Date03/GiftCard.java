package Practice.December2022.Date03;

public class GiftCard implements MerchendiseCommonMethods{
    @Override
    public void getfeature() {

        System.out.println("tim Hortons limited time giftcard");
    }

    @Override
    public int getprice() {
        int cost = 50;
        System.out.println("The gift card value is $: " + cost);
        return cost;
    }



}
