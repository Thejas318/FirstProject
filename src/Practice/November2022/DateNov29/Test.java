package Practice.November2022.DateNov29;


//User Defined Generic Class


// Java program to show working
// of user-defined Generic classes
class Test<T>{
    // An object of type T is declared
    T obj;
    Test(T obj) {               // constructor
        this.obj = obj;
    }

    public T getObject() {        //getter
        return this.obj;
    }
}

// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
       // iObj = sObj;                                  // This results an error. Even though iObj and sObj are of type Test,
                                                        // they are the references to different types because their type parameters differ.
                                                       // Generics add type safety through this and prevent errors
    }
}


