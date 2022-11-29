package Practice.OOPS.Inheritance;

public class BoxWeight extends Box {        //inheriting the box class using extends keyword.
    double weight;

    BoxWeight(){
        weight = 25.0;
    }

    BoxWeight(double val){

        this.weight = val;
    }



    BoxWeight(double side, double weight){
        super(side);                                                       // this super keyword will call the parent constructor ( in box class ) which takes one argument
        this.weight = weight;
    }
    public BoxWeight(double l, double w, double h, double weight) {     //Constructor which takes the argument for both box class and boxweight class.
        super(l, w, h);                                                //super keyword calls the parent class constructor.
        this.weight = weight;
    }

    public static void main(String[] args) {

        Box box1 = new Box();                                               //this is the object from parent class and it does not have access to properties of child class.

        BoxWeight box2 = new BoxWeight(4.0, 5.0, 6.0, 7.0);   //this is the object from child class and it does have access to properties of parent class

        System.out.println(box2.l);
        System.out.println(box2.w);
        System.out.println(box2.h);
        System.out.println(box2.weight);

        //Funny observation.
        Box box3 = new BoxWeight();                                        // Here the reference variable is of the the type box and actual object is of the type boxweight.
                                                                  // It is actually the type of the reference variable that determines what memebers can be accessed.
        //box3.weight;                                               // Here the box3 cannot access the propeties of boxweight class.

       //observation 2

       // BoxWeight box4 = new Box(1,2,3);  //commenting to avoid error.

        //explanation for the above error.
        //there are many variables in both parent and child class/
        //we are given access to the variables of the reference type which is boxweight here.
        //hence we should have access to weight variable which is present in boxweight class.
        //this alse means that the variables we are trying to access should be initialized.
        //but here the object itself of the type parent class, so how can we call the constructor of child class. that is why the error
    }
}





