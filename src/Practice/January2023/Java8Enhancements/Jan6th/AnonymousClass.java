package Practice.January2023.Java8Enhancements.Jan6th;

public class AnonymousClass {

    IGame game = new IGame() {
        @Override
        public void playGame() {
            //I'm implementing Igame interface without using a class which implements the Igame interface. This is called anonymous class. because there is no class name.
            System.out.println("I'm implementing Igame interface without using a class which implements the Igame interface");
        }
    };
    //Insert the semicolon after the anonymous class.
}
