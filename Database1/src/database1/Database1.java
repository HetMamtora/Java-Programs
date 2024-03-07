package database1;
import java.sql.*;
import java.util.*;

public class Database1 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/Projects/SQLite/univ.db");

            Statement stm = con.createStatement();
            
            //stm.executeUpdate("insert into dept values(60,'Chem')"); //DML QUERY 
            //stm.executeUpdate("delete from dept where deptno>50"); //DML QUERY 
            
            stm.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            // Print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
    
}
