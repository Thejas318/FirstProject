package Practice.November2022.DateNov30.MAPS.HashTableDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();             //creating a java propeties object to read and write the file.

        FileInputStream fis = new FileInputStream("C:\\Users\\Thejas\\IdeaProjects\\SecondCode\\src\\Practice\\November2022\\DateNov30\\HashTableDemo\\Developer.properties");     //creating an file input stream coz it required as an input for load method.

        p.load(fis);           //loading the file properties to java property object.

        System.out.println(p);

        p.setProperty("Company", "Canadian Imperial Bank of Commerce" );   //setting the properties in Developer.propeties file.
        p.setProperty("Salary", "60000");                                  // setting the properties in Developer.propeties file.
                                                                           //but this changes are not yet updated in the file.
        System.out.println(p);


        FileOutputStream fos = new FileOutputStream("C:\\Users\\Thejas\\IdeaProjects\\SecondCode\\src\\Practice\\November2022\\DateNov30\\HashTableDemo\\Developer.properties");
        //creating an output stream coz the store method of properties need it as input.

        p.store(fos, "Updated by Thejas");    //storing the changes in properties file.

    }
}
