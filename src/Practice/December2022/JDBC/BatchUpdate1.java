package Practice.December2022.JDBC;
//Study Order: 7

//demo for batch update using prepared statement.
//Conslusion of this program is batch update is efficient only with statement interface not prepared statement interface.

public class BatchUpdate1 {
     /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        String qry = "Update table1 set marks = 95 where id = 2";
        String qry1 = "insert into table1 Values(5, 'Parikshith', 80.50);
        String qry2 = "Delete from table1 where id = 5";

        //Try catch block for execption handling.
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");


            //For 1st query
            pstmt = con.CreateStatement(qry);
            pstmt.addbatch();
           int[] arr =  stmt.executeBatch();     //the return type of execute batch method is an integer array. the size of array represents the total number of DML queries added into the batch.
           System.out.println("Batch executed at once in DB");

            //printing the array object
            for(int i = 0; i < arr.length; i++){
            sout(i);
            }

             //For 2nd query
            pstmt1 = con.CreateStatement(qry1);
            pstmt.addbatch();
            int[] arr1 =  stmt.executeBatch();     //the return type of execute batch method is an integer array. the size of array represents the total number of DML queries added into the batch.
            System.out.println("Batch executed at once in DB");

            //printing the array object
            for(int i = 0; i < arr1.length; i++){
            sout(i);
            }

           //For 3rd query
           pstmt2 = con.CreateStatement(qry1);
           pstmt.addbatch();
           int[] arr2 =  stmt.executeBatch();     //the return type of execute batch method is an integer array. the size of array represents the total number of DML queries added into the batch.
           System.out.println("Batch executed at once in DB");

            //printing the array object
            for(int i = 0; i < arr2.length; i++){
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
