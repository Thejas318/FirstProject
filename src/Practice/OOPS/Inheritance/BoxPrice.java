package Practice.OOPS.Inheritance;

public class BoxPrice extends BoxWeight{


    double cost;

    public BoxPrice() {
        this.cost = 5.0;
    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(double val, double cost) {
        super(val);
        this.cost = cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    BoxPrice(double side , double weight, double cost){
        super(side, weight);       //this super will call the parent constructor ( in boxweight method) which takes 2 arguments.
        this.cost = cost;

    }
   public void operation(){
       System.out.println("hello, we are in boxprice class");
   }
}
