package Practice.December2022.JDBC;
//Study Order: 9
//Demo for JDBC transaction using Save Point.

public class JDBCTransactionUsingSavingPoints {

      /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt1 = null;
        SavePoint sp = null;
        String qry = "insert into table1 values(?, ?, ?, ?)";
        String qry1 = "insert into table2 values(?, ?, ?)";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID: ");
        int ID = sc.nextInt();

        System.out.println("Enter the Name: ");
        String name = sc.next();

        System.out.println("Enter the marks: ");
        Double marks = sc.nextDouble();

        System.out.println("Enter the Department: ");
        String department = sc.next();

        System.out.println("Enter the Place: ");
        String place = sc.nextString();

        sc.Close();      //closing the costly resource scanner.

        //Try catch block for execption handling.
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");

            con.SetAutoCommit(false);    //we are disabling the auto commit feature before the transaction begins but after the connection has been established.


            pstmt = con.PreparedStatement(qry);
            System.out.println("Statement object is created");

            pstmt.setInt(1,ID);
            pstmt.setString(2,name);
            pstmt.setDouble(3,marks);
            pstmt.setString(4,Department);

           pstmt.executeupdate();
           sout("Data inserted into table 1");
           //Above transaction completes the insertion into 1st table.
           sp = con.SetSavePoint();                    //creating a save point here. so if the 2nd transaction is not completed then the data inserted into table 1 is atleast saved.


           pstmt1 = con.PreparedStatement(qry1);
           System.out.println("Statement object 2 is created");

            pstmt.setInt(1,ID);
            pstmt.setString(2,name);
            pstmt.setString(3, Place);

            pstmt.executeupdate();
            sout("Data inserted into table 2");
             //Above transaction completes the insertion into 1st table.

            con.commit();            //saving the trasaction manually.
        }

        catch (ClassNotFoundException | SQLException e) {

            try{
            con.rollback(sp);           //passing sp as argument will make sure that the roll back is made till save point.
            sout("rolled back");
             }
             catch{
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
