package Practice.December2022.JDBC;
//Study Order: 6
//Batch Update with statement and prepared statement for multiple SQL DML Queries.
//This demo is for Statement Interface with batch update

public class BatchUpdate {

      /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        String qry = "Update table1 set marks = 95 where id = 2";
        String qry1 = "insert into table1 Values(5, 'Parikshith', 80.50);
        String qry2 = "Delete from table1 where id = 5";

        //Try catch block for execption handling.
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");

            stmt = con.CreateStatement();
            System.out.println("Statement object is created");

            //Adding all the queries into a batch using addbatch method.
            stmt.addbatch(qry);
            stmt.addbatch(qry1);
            stmt.addbatch(qry2);
            System.out.println("All the queries added in one batch");

            //Executing the batch at once using execute batch method.
           int[] arr =  stmt.executeBatch();     //the return type of execute batch method is an integer array. the size of array represents the total number of DML queries added into the batch.
           System.out.println("Batch executed at once in DB");

            //printing the array object
            for(int i = 0; i < arr.length; i++){
            sout(i);
            }
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
