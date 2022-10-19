package array;

import java.util.Scanner;

public class FindingMultipleElements 
{
int x=1;
	
	public void findingElemnets(int[] m)
	{
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				if(i==j || m[i]==0)
					continue;
				else
				{
					if(m[i]==m[j])
					{
						x++;
						m[j]=0;
					}
				}
			}
			if(m[i]!=0)
			System.out.println(m[i]+" : "+x);
			x=1;
		}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}

	for(int i:a)
	{
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	new FindingMultipleElements().findingElemnets(a);
	
	sc.close();
	}

}
