package jdbc1;
import java.sql.*;
public class ProductConnecting {

	public static void main(String[] args) throws SQLException
	{
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from PRODUCT36");
		
		while(rs.next())
		{
			System.out.printf("%5s%15s%10s%5s",rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4));
			System.out.println();
		}
		
		con.close();
	}
		
}
