package array;

import java.util.Scanner;

public class KadanesAlgorithm {

	void maximumsum(int a[]) 
	{    int maxsum=0,sum=0;
		for(int i=0;i<a.length;i++)
		{	      
			
				for(int j=i;j<a.length-i;j++)
				{
					sum+=a[j];
					
				}	
				if(maxsum<sum)
				{
				
					maxsum=sum;
				}
				sum=0;
			
		}
		System.out.println(sum);	
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int length;
		System.out.println("enter the array length");
		length=s.nextInt();
		int array[]=new int[length];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		new KadanesAlgorithm().maximumsum(array);
		s.close();

	}

}
