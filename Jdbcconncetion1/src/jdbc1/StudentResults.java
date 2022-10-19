package jdbc1;

import java.sql.*;
import java.util.Scanner;


public class StudentResults
{
public static void main(String[] args) throws SQLException
{
	Scanner sc=new Scanner(System.in);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
	Statement st=con.createStatement();
	System.out.println("Enetr the Hallticket Number");
	int number=sc.nextInt();
	ResultSet rs=st.executeQuery("select * from studentmarklist where sthall="+number+"");
	while(rs.next())
	{
		System.out.printf("your Hall ticket Number = %s\nName : %s\nScince : %s\nmaths :%s\nSocial :%s",
				rs.getString(1),rs.getString(2),rs.getString(3),
				rs.getString(4),rs.getString(5));
		
	}
	
	con.close();
	sc.close();
}
}
