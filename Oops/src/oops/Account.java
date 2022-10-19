package oops;

import java.util.Scanner;

public class Account
{
	Scanner sc=new Scanner(System.in);
	
	Coustmer cobj=new Coustmer(sc.nextLine(),sc.nextLine());
	String coustmer=cobj.getFirstname()+cobj.getLastname();
	 double  balance;  
	 int  Account=12345678;
	 float interestRate=0.5f;
	 
	 Account(int acountnumber)
	 {
		 if(Account!=acountnumber)
		 {
			 System.out.println("account number not matched");
			 return;
		 }
		 else {
			 System.out.println(coustmer);
			 System.out.println(Account);
			 System.out.println();
		 }
			 
		 
	 }
	 
	 
	 double deposit(double amount)
	 {
		 balance+=amount;
		 return balance;
	 }
	 
	 double withdraw(double amount)
	 {
		 if(amount<balance)
		 {
			 balance-=amount;
		 }
		 else 
		 {
			System.out.println("balance is low"); 
		 }
			 
			 return balance;
	 }
	 
	 
}
