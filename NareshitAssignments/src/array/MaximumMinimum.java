package array;

import java.util.Scanner;

public class MaximumMinimum {

	
	void findminmax(int[] a)
	{
		int min=a[0],max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("min number:"+min);
		System.out.println("max number:"+max);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enetr the Numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i:a)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		new MaximumMinimum().findminmax(a);
		sc.close();
	}

}
