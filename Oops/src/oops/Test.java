package oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account number");
		Account acobj=new Account(sc.nextInt());
		
		
		
		System.out.println("Deposit money");
		System.out.println("your balance is"+acobj.deposit(sc.nextDouble()));
		System.out.println("Withdraw  money");
		System.out.println("your balance is"+acobj.withdraw(sc.nextDouble()));
		sc.close();
	}

}
