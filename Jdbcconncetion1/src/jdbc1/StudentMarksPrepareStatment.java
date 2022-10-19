package jdbc1;

import java.sql.*;

import java.util.Scanner;

public class StudentMarksPrepareStatment 
{

	int subjects()
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,marks,fail=0,failmark=0;
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter the "+i+"st subject marks");
			marks=sc.nextInt();
			while(marks<0||marks>100)
			{
				System.out.println("Enter agian"+i+"st Subject marks (not 100><0)");
				marks=sc.nextInt();
				
			}
			if(marks<35)
				++fail;
			if(fail>=1)
				failmark=1000;
			
			sum+=marks;
		}
		
		return sum+failmark;
	}
	
	
	private String garde(int sum)
	{
		if(sum<=600&&sum>=500)
			return "A";
		else if(sum<500&&sum>=400)
			return "B";
		else if(sum<400&&sum>=300)
			return "C";
		else if(sum<300&&sum>=210)
			return "D";
		else
			return "F";
	}
	
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc=new Scanner(System.in);
		
		int roolno,totalmarks,ch;String garde;float percentage;String Branch,name;
		
		StudentMarksPrepareStatment sp=new StudentMarksPrepareStatment();
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
		
		PreparedStatement ps=con.prepareStatement("insert into student64 values(?,?,?,?,?,?)");
		
		int selction=0;
		System.out.println("For See All List Press : 1\n"
				+ "See Only One Persion :2\n"
				+ "TO Delete Press : 3\n"
				+ "To Insert data Press :4");	
		
		System.out.println("Enter the choice ");
		selction=sc.nextInt();
		switch(selction)
		{
		    case 1:{
		    	ResultSet rs=ps.executeQuery("select * from student64");
				while(rs.next())
				{
					System.out.printf("%5s%15s%10s%10s\t%5s%5s",
							rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5),rs.getString(6));
					System.out.println();
				}
		    	break;
		    }
		    
		    case 2:{
		    	System.out.println("Enter the Student Rool Number");
		    	int no=sc.nextInt();
		    	ResultSet rs=ps.executeQuery("select * from student64 where rollno="+no+"");
				while(rs.next())
				{
					System.out.printf("%s\n%s\n%s\n%s\n%s\n%s",
							rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5),rs.getString(6));
					System.out.println();
				}
		    	break;
		    }
		    
		    case 3:{
		    	
		    	System.out.println("Press 1: to delete all\n"
		    			+ "press 2: To delete based Roolno\n"
		    			+ "press 3: To delete based Name\\n"
		    			+ "press 4: To delete based Branch\\n"
		    			+ "press 5: To delete based Total marks\\n"
		    			+ "press 6: To delete based Percentage\\n"
		    			+ "press 7: To delete based Garde\\n"
		    			);
		    	System.out.println("Enter the Choice");
		    	int choice=sc.nextInt();
		    	switch(choice)
		    	{
		    	case 1:
		    	{
		    		int c=ps.executeUpdate("delete from student64");
		    		if(c>0)
		    		{
		    			System.out.println(c+" deleted successfully");
		    		}
		    		break;}
		    	case 2:{
		    		System.out.println("Enetr the rool number");
		    		int data=sc.nextInt();
		    		int c=ps.executeUpdate("delete from student64 where  ROLLNO="+ data);
		    		if(c>0)
		    		{
		    			System.out.println(c+" deleted successfully");
		    		}
		    		break;}
		    	case 3:{
		    		System.out.println("Enetr the name");
		    		int data=sc.nextInt();
		    		int c=ps.executeUpdate("delete from student64 where  NAME="+ data);
		    		if(c>0)
		    		{
		    			System.out.println(c+" deleted successfully");
		    		}break;}
		    	case 4:{
		    		System.out.println("Enetr the  BRANCH");
		    		int data=sc.nextInt();
		    		int c=ps.executeUpdate("delete from student64 where   BRANCH="+ data);
		    		if(c>0)
		    		{
		    			System.out.println(c+" deleted successfully");
		    		}break;}
		    	case 5:{
		    		System.out.println("Enetr the TOTAl MARKS");
		    		int data=sc.nextInt();
		    		int c=ps.executeUpdate("delete from student64 where  TOTMARKS="+ data);
		    		if(c>0)
		    		{
		    			System.out.println(c+" deleted successfully");
		    		}break;}
		    	case 6:{
		    		System.out.println("Enetr the PERCENTAGE ");
	    		int data=sc.nextInt();
	    		int c=ps.executeUpdate("delete from student64 where  PER ="+ data);
	    		if(c>0)
	    		{
	    			System.out.println(c+" deleted successfully");
	    		}break;}
		    	case 7:{System.out.println("Enetr the Grade");
	    		int data=sc.nextInt();
	    		int c=ps.executeUpdate("delete from student64 where   RESULT="+ data);
	    		if(c>0)
	    		{
	    			System.out.println(c+" deleted successfully");
	    		}
	    		break;}
		    	default:{
		    		System.out.println("No Select the coreect agin");
		    	}
		    	}
		    	
		    	ResultSet rs=ps.executeQuery("select * from student64");
				while(rs.next())
				{
					System.out.printf("%5s%15s%10s%10s%5s%5s",
							rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5),rs.getString(6));
					System.out.println();
				}
		    	break;
		    }
		    
		    case 4:{
		    	
				do {
					
					System.out.println("enter rool number");
					roolno=sc.nextInt();
					ps.setInt(1, roolno);
					sc.nextLine();
					System.out.println("Enter the name");
					name=sc.nextLine();
					ps.setString(2, name);
					
					System.out.println("Enter the Branch");
					Branch=sc.nextLine();
					ps.setString(3, Branch);
					
					totalmarks=sp.subjects();
				
					garde=sp.garde(totalmarks);
					ps.setString(6, garde);
					if(totalmarks>1000)
					{
						totalmarks-=1000;
					}
					ps.setInt(4, totalmarks);
					percentage=totalmarks/6.0f;
					
					ps.setFloat(5,  percentage);
					int x=ps.executeUpdate();
					
					totalmarks=0;
					percentage=0.0f;
					System.out.println("Enter 1 for enter details or press any to back");
					ch=sc.nextInt();
				}while(ch==1);
				
				ResultSet rs=ps.executeQuery("select * from student64");
				while(rs.next())
				{
					System.out.printf("%5s%15s%10s%12s%15s%5s",
							rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5),rs.getString(6));
					System.out.println();
				}
		    	break;
		    }
		}
		
		
		con.close();
		sc.close();
		
	}

	
	
	
}
