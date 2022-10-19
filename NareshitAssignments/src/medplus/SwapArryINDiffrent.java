package medplus;
import java.util.*;
public class SwapArryINDiffrent {

	
	void SwapArry(int a[],int g)        // 1 2 4 5
	{	int swap,h=0,k=0;               // 0 1 2 3 
	   
	while(k<a.length/g)
		{ 
			
			for( int i=h;i<g+h;i++)
			{
				
				swap=a[(g+h)-1];
				for(int j=(g+h)-1;j>i;j--)
				{
				
					a[j]=a[j-1];
				}
				a[i]=swap;
			}
			h+=g;
			
			k+=1;
			
		}
		System.out.println("");
		for(int hh=0;hh<a.length;hh++)
		{
			
			System.out.print(a[hh]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int groupdiv,arrayele;
		System.out.println("enter the divof group");
		groupdiv=s.nextInt();
		System.out.println("number of elemts array");
		arrayele=s.nextInt();
		int arry[]=new int[arrayele];
		
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=s.nextInt();
		}
		
		for(int hh=0;hh<arry.length;hh++)
		{
			System.out.print(arry[hh]+" ");
		}
		new	SwapArryINDiffrent().SwapArry(arry, groupdiv);	
		
   s.close();
	}

}
