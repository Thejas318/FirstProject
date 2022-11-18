package Practice.OOPS.Inheritance;

public class Numbers {

    //Method overloading
    int sum(int a, int b){          //sum method which accepts 2 arguments
        return a+b;
    }

    int sum(int a, int b, int c){   //sum method which accepts 3 arguments
        return a + b + c;
    }
    void sum(double a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(5.0,9)  ;        //during compilation itself it will decide which method to call based on the arguments or return type or ordering of arguments.
    }                                  //Compile time polymorphism called bcoz java decides which method to call during compile time.
}
