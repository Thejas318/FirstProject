package Practice.OOPS;

public class OOPsFirstLesson {
  int marks = 80    ;

    public static void main(String[] args) {
        OOPsFirstLesson thejas = new OOPsFirstLesson();
        thejas.marks = 95;
        System.out.println(thejas.marks);             //It'll first check whether the object has marks or not.
                                                      //If object has a marks column it will print the value. else
                                                      // it'll check if the class has the value, which is 80 here. it'll print that value
                                                       //try removing thejas.marks = 80 and run.
    }
        

    }

