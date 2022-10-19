package array;

import java.util.Scanner;

public class NthMthLargestNumber {
	
	/*void sorting(int a[])
	{
		int swap;
		for(int i=0;i<a.length;i++)//5 2 6 4
		{
				
			for(int j=0;j<(a.length-1)-i;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
				
			}
		}
		/*System.out.println("Sorting Arry");
		for(int i:a)
		{System.out.print(i+" ");}
		
		
		
	}
	*/
	void search(int choice1,int choice2,int a[])
	{
		if(choice1>=a.length && choice2>=a.length)
			System.out.println("enter coreect choice the maximum number in array is "+(a.length-1));
		else
		{
			System.out.println(a[choice1]);
			System.out.println(a[choice2]);
		}
	}
	
	
	public static void main(String[] args) 
	{
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
		
		new NthMthLargestNumber().search(2, 4, a);;
		sc.close();
	}

}
