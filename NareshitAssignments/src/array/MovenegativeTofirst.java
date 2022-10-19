package array;

public class MovenegativeTofirst 
{

	int[] moveNegative(int[] a)
	{
		int negativeindex=0,temp=0;
		for(int i=0;i<a.length;i++)
		{
			//2,-9,10,12,5,-2,10,-4
		
			if(a[i]<0)
			{
				temp=a[i];
				
				for(int j=i;j>negativeindex;j--)
				{
					a[j]=a[j-1];
				
					
				}
				a[negativeindex++]=temp;
				
				
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		
		int m[]=new MovenegativeTofirst().moveNegative(new int[] {2,-9,10,12,5,-2,10,-4});
		for(int i:m)
			System.out.print(i+" ");
	}

}
