package database2;
import java.sql.*;
import java.util.*;

public class Database2 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/Projects/SQLite/univ.db");

            Statement stm = con.createStatement();
            
            stm.executeUpdate("create table Temp(a integer, b float)");
            //stm.executeUpdate("drop table Temp");
            
            stm.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            // Print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
    
}
