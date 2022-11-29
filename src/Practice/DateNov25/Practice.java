package Practice.DateNov25;

public class Practice {
    private String name;
    private int rollno;

    private static int y = 12;          //all objects will share the same copy instead of having each objects having their own instances of y. coz it is static.

    public static void main(String[] args) {


        Practice x = new Practice();
        x.Hello("Thejas", 4016);      // here 'x' is implicit parameter. And "Thejas" is explicit parameter.
        System.out.println(x);              //if we try to print the object 'x' without overriding the tostring method, it will print the hash value.


    }
    
    public void Hello(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
       System.out.println("Hello " + name);

    }
    @Override
    public String toString(){
       return name + " " + rollno;   //overriding the tostring() to print the object contents. say return and write whatever it should return

    }
}

