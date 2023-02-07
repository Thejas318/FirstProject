package Practice.November2022.DateNov30.CollectioSetDemo;

import java.util.Comparator;
//creating a customized sorting order by implementing comparator interface
public class MyComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

     if(I1 < I2)            //logic for sorting the elements in descending order
            return +1;


        if(I1 > I2)
            return -1;


        else
            return 0;

        //Other tricks/implementations of compare method that we can use.
        //let's try to implement compareto() method of comparable interface inside our customized sorting compare method.

        //  return I1.compareTo(I2);        //this will simply return the ascending order of inserted elements.

        //   return -I1.compareTo(I2);      //this will simply return the descending order of inserted elements.

      //    return I2.compareTo(I1);        //this will simply return the descending order of inserted elements.

       // return -I2.compareTo(I1);         //  this will simply return the ascending order of inserted elements.

    //  return +1;                       //adds the elements in the order of insertion along with duplicates

        // return -1;                       ////adds the elements in the reverse order of insertion along with duplicates

    //    return 0;                           //adds only the first element and all other elements are considered as duplicates.
    }
}
