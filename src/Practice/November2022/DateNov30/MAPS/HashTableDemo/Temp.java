package Practice.November2022.DateNov30.HashTableDemo;

public class Temp {
        int i;

        Temp(int i){
            this.i = i;
        }

     @Override
     public int hashCode( ) {       //overriding the hashcode method in object class to create our own hashcode
       // return i;               // returns "i" as the hash code.
         return i % 9;           //return i % 9 as the hashcode. and sorting will be based on that.

     }

     @Override
     public String toString() {
         return i + "";
     }

}
