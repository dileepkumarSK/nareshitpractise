package jdbc1;
import java.sql.*;
import java.util.Scanner;
public class CallbalePractice {
	
	public static void main(String[] args) throws SQLException {
		Connection con =DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","C##Dileep","7036");
		Scanner sc=new Scanner(System.in);
		
		
		int accno,hno,pincode,ch=0;
		long phno;
		float bal;String actype;
		String name,mail,street,city;
		
		CallableStatement cs = con.prepareCall
				("{call CUSTFULLDET(?,?,?,?,?,?,?,?,?,?)}");
			
		do{	System.out.println("Enter Account Number");
			accno=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Account Holder Name");
			name=sc.nextLine();
			System.out.println("Enter balance");
			bal=Float.parseFloat(sc.nextLine());
			System.out.println("enetr account type");
			actype=sc.nextLine();
			actype=""+actype.charAt(0);
			System.out.println("Enter house Number");
			hno=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Strret");
			street=sc.nextLine();
			System.out.println("Enter city");
			city=sc.nextLine();
			System.out.println("Enter pincode");
			pincode=Integer.parseInt(sc.nextLine());
			System.out.println("Enter mailId");
			mail=sc.nextLine();
			System.out.println("Enter Phone number");
			phno=Long.parseLong(sc.nextLine());
			
			cs.setInt(1,accno);
			cs.setString(2,name);
			cs.setFloat(3,bal);
			cs.setString(4,actype);
			cs.setInt(5,hno);
			cs.setString(6,street);
			cs.setString(7,city);
			cs.setInt(8,pincode);
			cs.setString(9,mail);
			cs.setLong(10,phno);
			cs.execute();
			System.out.println("Data Inserted Successfully");
			System.out.println("enetr 1 to add one more");
			ch=Integer.parseInt(sc.nextLine());
		}while(ch==1);
		
		
		CallableStatement cs1 = con.prepareCall
				("{call Retriveingcustfulldet(?,?,?,?,?,?,?,?,?,?)}");
		
		System.out.println("enter the number ");
		int acno=sc.nextInt();
		cs1.setInt(1, acno);
		cs1.registerOutParameter(2,Types.VARCHAR);
		cs1.registerOutParameter(3,Types.FLOAT);
		cs1.registerOutParameter(4,Types.CHAR);
		cs1.registerOutParameter(5,Types.INTEGER);
		cs1.registerOutParameter(6,Types.VARCHAR);
		cs1.registerOutParameter(7,Types.VARCHAR);
		cs1.registerOutParameter(8,Types.INTEGER);
		cs1.registerOutParameter(9,Types.VARCHAR);
		cs1.registerOutParameter(10,Types.INTEGER);
		
		cs1.execute();
		
		System.out.println(acno);
		System.out.println(cs1.getString(2));
		System.out.println(cs1.getFloat(3));
		System.out.println(cs1.getString(4));
		System.out.println(cs1.getInt(5));
		System.out.println(cs1.getString(6));
		System.out.println(cs1.getString(7));
		System.out.println(cs1.getInt(8));
		System.out.println(cs1.getString(9));
		System.out.println(cs1.getLong(10));
		cs1.close();
		con.close();
		sc.close();
	}
	
	

}




/*
 
  create or replace procedure CUSTFULLDET
  (a_no number,c_name varchar2,bal number,a_type char, 
  h_no number,sname varchar2,city varchar2,pincode number,
   mid varchar2,phno number) is
  Begin 
  insert into custdata values(a_no,c_name,bal,a_type);
  insert into custdet values(a_no,h_no,sname,city,pincode);
  insert into custcontact values(a_no,mid,phno);
  END;
  
 */


/*  
			create or replace procedure Retriveingcustfulldet
    	  	(a_no number,c_namec OUT varchar2,balc OUT number,a_typec OUT char, 
  			h_noc OUT number,snamec OUT varchar2,cityc OUT varchar2,
  			pincodec OUT number,midc OUT varchar2,phnoc OUT number) is
  			BEGIN 
  			select NAME,BAL,ACCTYPE into c_namec,balc,a_typec from custdata where ACCNO=a_no;
  			select H_NO,SNAME,CITY,PINCODE into h_noc,snamec,cityc,pincodec from custdet where ACCNO=a_no;
  			select MID,PHNO into midc,phnoc from custcontact where ACC=a_no;
  			END;             
  			            
  			
 			drop procedure Retriveingcustfulldet;
 */
