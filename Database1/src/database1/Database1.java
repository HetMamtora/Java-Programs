package database1;
import java.sql.*;
import java.util.*;

public class Database1 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/Projects/SQLite/univ.db");

            //Statement stm = con.createStatement();
            
            //stm.executeUpdate("insert into dept values(60,'Chem')"); //DML QUERY 
            //stm.executeUpdate("delete from dept where deptno>50"); //DML QUERY
            
            //INSERT USING PREPARED STATEMENT
            PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter student data: ");
            int r=sc.nextInt();
            String name=sc.next();
            String city=sc.next();
            int dno=sc.nextInt();
            
            stm.setInt(1, r);
            stm.setString(2, name);
            stm.setString(3, city);
            stm.setInt(4, dno);
            
            stm.executeUpdate();
            
            stm.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            // Print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
    
}
