package Practice.December2022.JDBC;
//Study Order: 1
// Demo program to show the different steps of JDBC.

public class StepsOfJDBC {


    /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        String qry = "Insert into table 1 values(1, 'Rahul', 88.90)";

        //Try catch block for execption handling.
        try {

            //This is the step 1 of JDBC. Registering and Loading the driver class provided by the database vendor.
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");
            // "com.mysql.jdbc.Driver" is a fully classified class name provided by vendor

             //This is the step 2 of JDBC. Establishing connection between Java application and DB server.
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");
            //getconnection is a helper method present in driver manager helper class.
            //getconnection method helps in creating the implpementation object of connection interface.


            //This is the step 3rd of JDBC. Creating a statement object or platform which carries our SQL queries to the database and brings back the resultset from database to the java application.
            //Connection class has the methods required to create the implementation object to statement, prepared statement and callable statement interface.

            stmt = con.createStatement();
            System.out.println("Statement object is created");

            //methods present inside the statement interface helps us to execute DML, DQL, DDL queries.
            stmt.executeUpdate(qry);
            System.out.println("Data inserted");

        }

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        //Finally block is used to close all the costly resources.
       // we have 2 costly resources here. 1 --> connection object. 2 --> statement object.
        finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    */
}
