package array;

import java.util.Scanner;

public class SplitingArray {

	int swap;
	void getSplit(int[] a,int splitindexnumber)
	{
		int x=splitindexnumber;
		for(int i=0;i<a.length-splitindexnumber;i++)
		{
			swap=a[x++];
			for(int j=splitindexnumber+i;j>i;j--)
			{    
				a[j]=a[j-1];
				
				
			}
			a[i]=swap;
		}
		
		System.out.println();
		for(int i:a)
			System.out.print(i+" ");
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
		
		
		new SplitingArray().getSplit(a, 3);
		System.out.println();
		sc.close();
	}

}
