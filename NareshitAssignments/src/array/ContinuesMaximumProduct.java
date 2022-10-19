package array;

public class ContinuesMaximumProduct 
{
	
	void maximumProduct(int [] a)
	{
		int higestProduct=0,product=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
					product*=a[j];
					
					if(product>higestProduct)
						higestProduct=product;	
			}
		
			product=1;
			
		}
	
		System.out.println(higestProduct);
	}

	
	
	
	public static void main(String[] args) 
	{
		//6 ,-3,-10,0,60
		//-2,-40,0,-2,-3
		new ContinuesMaximumProduct().maximumProduct(new int[] {6 ,-3,-10,0,60});

	}

}
