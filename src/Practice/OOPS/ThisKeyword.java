package Practice.OOPS;
//How to make constructor assign the passed values for different objects.
//constructor overloading
public class ThisKeyword {

    public static void main(String[] args) {

        Student thejas = new Student();
        Student sriram = new Student("Sriram", 40161684, 85.6f);

        System.out.println(sriram.marks);
        System.out.println(sriram.name);
        System.out.println(sriram.ID);
        System.out.println(thejas.marks);
        System.out.println(thejas.name);
        System.out.println(thejas.ID);

        sriram.greeting();

        System.out.println("calling a constructor using another constructor");

        Student random = new Student();
        System.out.println(random.ID);
        System.out.println(random.name);
        System.out.println(random.marks);
        
    }
}

class Student{
    String name;
    int ID;
    Float marks;

    void greeting(){
        System.out.println("Hello!! my name is " + this.name);
    }
    Student(){                     //This constructor will return same value to all the objects. eg: for both sriram and thejas, the values will be same.
       this.name = "Sriram";     //when the object is created and constructor runs, "this" will replaced by the referencce variable.
       this.ID = 40161927;       //when the object is created, if we dont pass the arguments in the constructor, this constructor block will be executed.
       this.marks = 80f;

   }

    Student(String name, int ID, Float marks) {       //This constructor will assign the passed values. so all objects will have diff values.
        // when the object is created, if we pass the arguments in the constructor, this constructor block weill be executed.
        this.name = name;                            //constructor overloading
        this.ID = ID;
        this.marks = marks;
    }

        //calling a constructor from another constructor.
        //Student () {                              //remove comments to try this method
          //  this ("Parth", 4166, 85.6f);
      //  }

}
