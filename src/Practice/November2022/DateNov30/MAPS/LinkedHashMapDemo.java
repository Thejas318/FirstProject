package Practice.November2022.DateNov30.MAPS;


import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap m = new LinkedHashMap();

        m.put("Sampath", 40161223);
        m.put("Sriram", 40161645);
        m.put("Bhawin", 401617554);
        m.put("Srinath", 40141820);
        m.put("Sagar", 40165523);

        System.out.println(m);

        System.out.println(m.put("Sagar", 40158963));

        System.out.println(m);
        //insertion order is preserved.
        //All the other methods used in HashMapDemo class is applicable to this class also.




    }
}
