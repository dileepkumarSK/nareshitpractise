package array;

import java.util.Scanner;

public class FindAverage 
{

	
	int averageOfArray(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
	
		}
		return sum/a.length;
	}
	
	
	void comaprisionArray(int[] a,int[] b)
	{
		int check=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					check=1;
					break;
				}
		
			}
			if(check==1)
			{
				System.out.println("array not equal");
			}
			else
			{
				System.out.println("equal");
			}
			
		}
		else
		{
			System.out.println("array not equal");
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enetr the Numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		/*for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		for(int i:a)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		for(int i:b)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		//System.out.println(new FindAverage().averageOfArray(a));
		
		new FindAverage().comaprisionArray(a, b);*/
		System.out.println(new FindAverage().averageOfArray(a));
		
		sc.close();
	}

}
