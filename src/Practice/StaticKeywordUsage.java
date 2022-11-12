package Practice;

class Emp {

    int empid;
    int salary;
    static String ceo;

    static {                                    // static method.
        ceo = "Arman";                         // initializing the static variable. This will be called only once and will make changes in all the objects.
        System.out.println("called only once");
    }

    Emp() {                                   // Constructor method.
        empid = 1;                           // constructor method can be used to intialize the non-static variables.
        salary = 800;                        // constructor method will be called only once per object.
        System.out.println("called once per object");
    }

    public void show() {
        System.out.println(empid + ":" + salary + ":" + ceo);
    }

}

public class StaticKeywordUsage {
    public static void main(String[] args) {
        Emp thejas = new Emp();
        Emp sriram = new Emp();

        thejas.empid = 4016;                   // using objects to change the values of intialized non static variables.
        thejas.salary = 1200;

        sriram.empid = 4019;
        sriram.salary = 1500;                 // using objects to change the values of intialized non static variables.


        thejas.show();
        sriram.show();
    }
}
