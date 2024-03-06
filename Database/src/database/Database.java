package database;
import java.sql.*;

public class Database {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        /*Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:‪D:/Projects/SQLite/univ.db");
        
        Statement stm=con.createStatement();
        
        ResultSet rs=stm.executeQuery("select * from students");
        
        while(rs.next())
        {
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.print(rs.getInt(4)+" ");
        }
        
        stm.close();
        con.close();*/
        
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/Projects/SQLite/univ.db");
            
            // Create a statement
            Statement stm = con.createStatement();
            
            // Execute a query to select all records from the students table
            ResultSet rs = stm.executeQuery("SELECT * FROM students");
            
            // Process the results
            while(rs.next()) {
                System.out.print(rs.getInt("roll") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("city") + " ");
                System.out.print(rs.getInt(4) + " ");
                System.out.println(); // Move to the next line for the next record
            }
            
            // Close the resources
            rs.close();
            stm.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            // Print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
    
}
