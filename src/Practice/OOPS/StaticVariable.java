package Practice.OOPS;

//Usage of static variables and their initialization using static block

public class StaticVariable {

    static int a;                 //static variable.
    static int b;

    static  {          //static block to initialize the static variable.
    a = 5;             // This will run only once when the first object is created.
    b = a * 5;
    }
    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();

        System.out.println(StaticVariable.a);
        System.out.println(StaticVariable.b);

        StaticVariable obj2 = new StaticVariable();        //second object creation will not rum the static block again.
        System.out.println((StaticVariable.b));
    }
}
