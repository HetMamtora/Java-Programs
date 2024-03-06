import java.sql.*;

class Database
{
	public static void main(String args[]) throws Exception
	{
		Class.forName(org.sqlite.JDBC);
		Connection con=DriverManager.getConnection("jdbc:sqlite:univ.db"); //CONNECTION STRING
		Statement stm=con.createStatemenet();
		ResultSet rs=stm.executeQuery("select * from dept");

		int dno;
		String dname;
		while(rs.next())
		{
			dno=rs.getInt("deptno");
			dname=rs.getString("dname");

			System.out.println(dno+" | "+dname);
		}
	}
}