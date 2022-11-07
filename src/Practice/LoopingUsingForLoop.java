package Practice;

public class LoopingUsingForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {          //variable declared inside a for loop is valid to use only in the scope of for loop
                                            // if we want to use the variable i outside the loop then declared it inside the method instead of the loop.
            System.out.println("hello");

        }

    }

}
