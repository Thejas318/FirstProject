package Practice;


public class Calculator
{

    public static void main(String[] args)
    {
        System.out.println(Add(5,10));
        System.out.println(Sub(5,10));
        System.out.println(Multi(5,10));
        System.out.println(div(5,10));
    }

    //Addition Method
    public static int Add(int a, int b)
    {
     int sum = a + b;
     return sum;
    }

     // Subtraction Method
    public static int Sub(int a, int b)
    {
        int dif = a - b;
        return dif ;
    }

// Multiplication  Method
    public static int Multi(int a, int b)
    {
        int res = a * b;
        return res;
    }

// Division  Method
    public static double div(double a, double b)
    {
        double res2 = a / b;
        return res2;
    }

}


