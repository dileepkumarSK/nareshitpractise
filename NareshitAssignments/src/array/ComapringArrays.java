package array;

import java.util.Scanner;

public class ComapringArrays 
{
	Scanner sc=new Scanner(System.in);

	boolean comparinArray(int a[],int b[])
	{
		boolean k=true;
		if(a.length!=b.length)
			k= false;
		else
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					k= false;
				else
					k= true;
			}
		}
		return k;
	}
	
	int[] inputArray()
	{
		System.out.println("Eneter the lentgh Of an Array");
		int a[]=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	
	public static void main(String... args)
	{
		System.out.println("First Arrsy");
		int Arry1[]=new ComapringArrays().inputArray() ;
		for(int i:Arry1)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Second Array");
		int Arry2[]=new ComapringArrays().inputArray() ;
		for(int i:Arry2)
			System.out.print(i+" ");
		System.out.println();
		System.out.println(new ComapringArrays().comparinArray(Arry1, Arry2));
	}

}
