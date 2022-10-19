package jun032022;

import java.util.Scanner;

public class RowsumOfaMatrix {

	public static void m1()
	{
		System.out.println("static import");
	}
	
	
	
	int[]  getRowSum(int [][]a,int r,int c)
	{
		int sum=0,rea[]=new int[3];
	
		if(r!=3 && c!=3)
		{
			int b[]=new int[0];
			return b;
		}
		else
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					sum+=a[i][j];
				}
				rea[i]=sum;
				sum=0;
			}
			return rea;
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int r,c;
	
		System.out.println("enter the rows and Columns");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		System.out.println();
		System.out.println("enter the array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		int m[]=new RowsumOfaMatrix().getRowSum(a, r, c);
		
		for(int i:m)
			System.out.print(i+" ");
		
		
	
		sc.close();
	}

}
