package Practice.Doubt;

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
     //   obj.    //success
        Puppy obj1 = new Puppy();
      //  obj1. //success

        Animal obj2 = new Animal();
        // obj2.   //success.

        Animal obj3 = new Dog();
     //   obj3.animal();   //doubt cleared.

        Animal obj4 = new Puppy();
      //  obj4.animal();      //success

        Dog obj5 = new Puppy();
      //  obj5.animal2();

        Puppy obj6 = new Puppy();
       // obj6.

     //   Puppy obj7 =  new Animal();    //downcasting works only with casting.
      //  obj



    }
}
