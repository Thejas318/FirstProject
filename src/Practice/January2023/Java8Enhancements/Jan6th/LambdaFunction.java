package Practice.January2023.Java8Enhancements.Jan6th;

public class LambdaFunction {

    public static void main(String[] args) {

        //Lambda function is the best method to give implementation to functional interface. it just takes a line pf code.
        //Anonymous classes are best to implementation for interfaces with multiple methods without using class. wherein lambda function is best for interfaces with just one method(functional interface).

    //    IGame game = () -> System.out.println("Implenting the IGame interface using Lambda function");

      //  game.playGame();

        //Now trying to give implementation without using IGame game:
        startPlay(() -> System.out.println("Implentation of interface without even using IGame game"));
        // In the above statement compiler understands that startPlay method accepts the IGame object and it'll create the object for uys. no need to write the code.

        startPlay(() -> System.out.println("we can give multiple implementation within the same class. no need to create a separate class, then implement and then overriding...."));
    }


    public static void startPlay(IGame obj){
        obj.playGame();
    //    System.out.println("Playing");


    }


}
