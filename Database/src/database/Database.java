package database;
import java.sql.*;
import java.util.*;

public class Database {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/Projects/SQLite/univ.db");
            
            // Create a statement
            //Statement stm = con.createStatement(); //LECTURE 281
            
            // Execute a query to select all records from the students table
            //ResultSet rs = stm.executeQuery("SELECT * FROM students"); //LECTURE 281
            
            
            //LECTURE - 282 -- PREPARED STATEMENT
            PreparedStatement stm = con.prepareStatement("select * from students where deptno=?"); //LECTURE 282
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Department No.: ");
            int dno=sc.nextInt();
            
            stm.setInt(1, dno);
            
            
            ResultSet rs = stm.executeQuery(); //LECTURE 282
            
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
