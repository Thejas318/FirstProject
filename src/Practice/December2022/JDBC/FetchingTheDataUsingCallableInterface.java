package Practice.December2022.JDBC;
//Study Order: 5
//Fetching the data using callable interface and stored procedure.
// stored procedure is used when we want to execute same set of queries again and again.

public class FetchingTheDataUsingCallableInterface {

    /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        callableStatement cstmt = null;
        ResultSet rs = null;

        String qry = "select * from table1";       //fetching all the information from database.

        //Try catch block for execption handling.
        try {


            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");

            cstmt = con.PrepareCall(call fetching.fetch);
            //'call' is a keyword to call the stored procedure. Here 'fetch' is a name of the stored procedure.

            System.out.println("callable Statement object is created");

           //using execute query method which is meant for DQL queries.
           rs = cstmt.executeQuery();
           System.out.println("Data fetched from database");


           //Printing the contents stored in result set implementation object.
           //To print anything in particular use absolute method instead of next method.

           While(rs.next) {
           int id = rs.getInt("id");
           String name = rs.getString("name");
           Double marks = rs.getDouble("marks");
           System.out.println(id + " " + name + " " + marks);


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
