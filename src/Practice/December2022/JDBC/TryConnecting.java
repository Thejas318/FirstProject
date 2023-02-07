package Practice.December2022.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryConnecting {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        String qry = "insert into rbc.employee values( 'Saideep', 850,  70000)";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered and loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Graduate2022");

            System.out.println("Connection established");

            stmt = con.createStatement();
            System.out.println("Statement object created");

            stmt.executeUpdate(qry);

            System.out.println("SQL query successfully executed");



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            if(con != null){
                try {
                    con.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
            if(stmt != null){
                try {
                    stmt.close();
                    System.out.println("Statement object closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }


    }

}
