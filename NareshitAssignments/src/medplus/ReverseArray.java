package medplus;

public class ReverseArray {
	
	
	void SwapArry(int a[])        // 1 2 4 5
	{	     
		    int swap;               // 0 1 2 3 
	   
		
			for(int i=0;i<a.length;i++)
			{
				swap=a[a.length-1];
				for(int j=a.length-1;j>i;j--)
				{
					a[j]=a[j-1];
				}
				a[i]=swap;
			}
			
		
		for(int hh=0;hh<a.length;hh++)
		{
			System.out.println(a[hh]);
		}
	}
	
	

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		new ReverseArray().SwapArry(a);
				
	}

}
