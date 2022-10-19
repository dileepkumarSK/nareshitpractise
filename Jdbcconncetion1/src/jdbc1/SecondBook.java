package jdbc1;
import java.sql.*;
import java.util.Scanner;
public class SecondBook {
	
	public static void main(String[] args) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		 int BOOKCODE;String BOOKNAME,BOOKAUTHOR;  int BOOKPRICE,BOOKQAUNTITY,ch;
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from BOOKDETAILS ");
		do {
			System.out.println("Book Code");
			BOOKCODE=sc.nextInt();
			sc.nextLine();
			System.out.println("BOOKNAME");
			BOOKNAME=sc.nextLine();
			System.out.println("BOOKAUTHOR");
			BOOKAUTHOR=sc.nextLine();
			System.out.println("BOOKPRICE");
			BOOKPRICE=sc.nextInt();
			System.out.println("BOOKQAUNTITY");
			BOOKQAUNTITY=sc.nextInt();
			
			int x=st.executeUpdate("insert into BOOKDETAILS values("+BOOKCODE+",'"+BOOKNAME+"','"+BOOKAUTHOR+"',"+BOOKPRICE+","+BOOKQAUNTITY+")");
			if(x>0)
			{
				System.out.println(x+" Inserted Sucessfully");
			}
			System.out.println("Enter 1 for insert agian");
			ch=sc.nextInt();
			
		}while(ch==1);
		
		
		System.out.println("==========================================");
		while(rs.next())
		{
			System.out.printf("%5s%15s%10s%5s%5s",rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getString(5));
			System.out.println();
		}
		sc.close();
		con.close();
	}
}