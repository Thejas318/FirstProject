package Practice;



public class DefaultConstructor {

    private int num;
    private String name;

    DefaultConstructor(int num){    //every class will have a default constructor which sets the instance variables to their default values.
        this.num = num;          //this constructor is just initializing the int num variable. but when we print string name, it will show 'null'.
    }                         // that means some constructor is working in background and initializing the unintialized instance variables is this constructor is not present.
                              //in this case the same constructor will insitialize the other variables to their default values.
    DefaultConstructor(int num, String name) {
        this(num);                      //using this keyword to call the other constructors present in the same group.
        this.name = name;

    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor(25, "thejas");
        System.out.println(obj.num);
        System.out.println(obj.name);

    }

}
