package array;

// deleting elements

public class DeiletingElementsInArray 
{
	void deleteElemenntInArray(int []a,int n)
	{
		//10,20,74,56,87,45
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
					
				}
			}
		}
		a[a.length-1]=0;
		for(int i=0;i<a.length-1;i++)
			System.out.println(a[i]);
	}
	public static void main(String[] args) 
	{
		
		new DeiletingElementsInArray().deleteElemenntInArray(new int[] {10,20,74,56,87,45}, 74);
	}

}
