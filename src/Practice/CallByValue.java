package Practice;

public class CallByValue {

    private int x = 50;

     void add(int x){

        x = x + 100;          //x is a local variable here.
         System.out.println("This is happening inside the add method: " + x);
    }

    public static void main(String[] args) {
        CallByValue obj = new CallByValue();

        System.out.println(obj.x);
        obj.add(100);
        System.out.println(obj.x);      //even after calling a method to change. the value of x remains same.
    }
}
