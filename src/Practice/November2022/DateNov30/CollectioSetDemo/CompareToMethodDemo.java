package Practice.November2022.DateNov30.CollectioSetDemo;

public class CompareToMethodDemo {
    public static void main(String[] args) {

        System.out.println("A".compareTo("Z")); //returns negative. bcoz A comes before Z. Internally it is subtracting the ascii value of A and Z.
        System.out.println("L".compareTo("A"));  //returns npositive. bcoz L comes after A. Internally it is subtracting the ascii value of L and A.
        System.out.println("A".compareTo("A"));  //returns O. equal objects.
      //  System.out.println("A".compareTo(null));  //Null pointer exception. coz cannot compare with null.
    }                                              //this is what happens when we use the default natural sorting order in treeset class also.
}
