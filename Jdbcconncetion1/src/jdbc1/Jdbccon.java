package jdbc1;

import java.sql.*;

import java.sql.SQLException;

public class Jdbccon
{

	public static void main(String[] args) throws SQLException
	{
		Connection con= DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
		
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from employee46");
		while(rs.next())
			
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+
		"\t"+rs.getString(3));
		}//end of loop
		con.close();
				
	}

}
