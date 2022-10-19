package array;
import java.util.Scanner;
public class SortingArray 
{
	
	void sortingASC(int a[])
	{	
		int swap;
		for(int i=0;i<a.length;i++)
		{	                                 // 1 2 3 6 9 5 4 7 8
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
		System.out.println("Assending Order");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	
	
	void sortingDECS(int a[])
	{	
		int swap;
		for(int i=0;i<a.length;i++)
		{	                                 // 1 2 3 6 9 5 4 7 8
				for(int j=0;j<(a.length-1)-i;j++)
				{
					if(a[j]<a[j+1])
					{ 
						swap=a[j];
						a[j]=a[j+1];
						a[j+1]=swap;
					}
				}	
			
		}
		System.out.println("Desending Order");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) 
	{
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
		new SortingArray().sortingASC(array);
		System.out.println();
		new SortingArray().sortingDECS(array);
		s.close();
	}

}
