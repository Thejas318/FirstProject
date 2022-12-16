package Practice.December2022.JDBC;

//Study Order: 2
//Demo for Updating the data in the database
//similarly we can run the delete and other DML queries just by changing the SQL query statements.

public class UpdatingTheDataBase {

    /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        String qry = "Update table1 set marks = 95 where id = 2";

        //Try catch block for execption handling.
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");

            stmt = con.createStatement();
            System.out.println("Statement object is created");


            stmt.executeUpdate(qry);
            System.out.println("Data updated");
        }

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        //Finally block is used to close all the costly resources.

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
