package Practice.December2022.JDBC;
//Study Order: 4
//Demo to insert multiple queries into the database using Prepared Statement and Placeholder concept

public class InsertingMultipleQueries {

    /*
    //commenting everything since we dont have jar file to connect to the database.

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);


        //Try catch block for execption handling.
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection between java application and database is established");

            pstmt = con.PrepareStatement("insert into table1(?, ?, ?));
            System.out.println("Prepared Statement object is created");

            do {

            System.out.println("Enter ID, Name, Marks");
            int id = sc.nextInt();
            String name = sc.next();
            Double marks = sc.nextDouble();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, marks);

            stmt.executeUpdate();
            System.out.println("Data Inserted");

            System.out.println("Enter 1 to insert more data and 2 to end the data insertion process");
            int opt = sc.nextInt();
            }
            While(opt == 1);   //this will help us insert multiple queries at once with reduced load on database.



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
