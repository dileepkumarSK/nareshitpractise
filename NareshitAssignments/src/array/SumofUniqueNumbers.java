package array;
import java.util.Scanner;
public class SumofUniqueNumbers
{
	int sumOfArray(int a[])
	{   
		int check=0,sum=0;
		for(int i=0;i<a.length;i++,check=0)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
					continue;
				else
				{
					if(a[i]==a[j])
						{
						check=1;
						
						}
				}
			}
			
			if(check!=1)
			{
				sum+=a[i];
				
			}
			
			
		}
	
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("size of arry");
		int len=s.nextInt();
		int arry[]=new int[len];
		
		for(int i=0;i<len;i++)
		{   
			System.out.println("enter number :"+ (i+1));
			arry[i]=s.nextInt();
		}
		for(int i=0;i<arry.length;i++)
		{   
			System.out.print(arry[i]+" ");
		
		}
		System.out.println();
		System.out.println("sum = "+new SumofUniqueNumbers().sumOfArray(arry));
		
		s.close();
	
	}

}
