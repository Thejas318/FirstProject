package Practice.OOPS;

//singleton class will have only one instance.

public class SingletonClass {
    public static void main(String[] args) {
        getinstance();
    }

    private SingletonClass(){                 //Constructor //First make the constructor private bcoz other classes should not be allowed to access the constructor to create the objects

    }

    private static SingletonClass oneinstance;         //Creating the reference to the only object that is going to be created.

    public static SingletonClass getinstance() {
        if(oneinstance == null){                     //if instance/object is not present then the value is null. so if block will create a new object
            oneinstance = new SingletonClass();
            System.out.println("only one object created");
        }
    return oneinstance;
    }
}
