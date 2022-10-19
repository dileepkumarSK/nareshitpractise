package arrays;

import java.util.Scanner;

public class MakingConsecutiveNumberZero {

	public static void main(String[] args) {
		int i,n,a[];
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n values");
		n=s.nextInt();
		a = new int[20];
		for(i=0;i<n;i++) 
		{
			
			a[i]=s.nextInt();
		}

		
		for(i=0;i<n-1;i++) 
		{
			if(a[i]+1==a[i+1]) {
				a[i+1]=0;
			}
			
		}
		for(i=0;i<n;i++) 
		{
			
			System.out.print(a[i]+" , ");
		}
	}

}
