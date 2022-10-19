package ioStreams;

import java.io.*;

import java.util.Scanner;

public class KishanSirTAsk 
{
	String teacherName="Admin";
	String StudentName="Dileep";
	String teacherPAssword="@dmin@123";
	String StudentPassword="Dipu@1439";
	
	void iomethod() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you teacher Press 1/Student press 2");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter User Name : ");
			sc.nextLine();
			if(teacherName.equals(sc.nextLine()))
			{
				System.out.println("Enter the PAssword");
				if(teacherPAssword.equals(sc.nextLine()))
				{
					
					System.out.println("What is Today Question..!");
					FileWriter fw=new FileWriter("A://java/qtpaper.txt");
					System.out.println("Enter the Question");
					String question=sc.nextLine();
					fw.write(question);
					System.out.println("Question Added Successfully");
					fw.close();
				}
				else
				{
					System.out.println("Oops Password Incorrect");
				}
				
			}
			else
			{
				System.out.println("User name Inccorect ");
			}
		}
		else if(choice==2)
		{
			System.out.println("Enetr the user name");
			sc.nextLine();
			if(StudentName.equals(sc.nextLine()))
			{
				System.out.println("Enter the Password");
				if(StudentPassword.equals(sc.nextLine()))
				{
					
					System.out.println("Welcome"+StudentName+"!!!");
					System.out.println("Answer the below Question..?");
					System.out.println();
					FileReader fr=new FileReader("A://java/qtpaper.txt");
					int i;
					while(( i=fr.read())!=-1)
					{
						System.out.print((char)i);
					}
					FileWriter fw=new FileWriter("A://java/qtpaper.txt",true);
					
					fw.write("\n");
					
					String answer=sc.nextLine();
					
					fw.write(answer);
					System.out.println("Answer Added Successfully");
					
					
					fw.close();
				
				}
				else
				{
					System.out.println("Oops Password Incorrect");
				}
			}
			else
			{
				System.out.println("User name Inccorect");
			}
		}
		else 
		{
			System.out.println("Enter the Correct choice!");
		}
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new KishanSirTAsk().iomethod();
	}
}
