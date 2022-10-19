package arrays;

public class ManishEx 
{
	void subset(int n,int []a,int sum)
	{
		int x;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				x=0; 
				for(int k=i;k<=j;k++)
				{
					x=x+a[k];
					if(x==sum)
					{
						for(int m=i;m<=j;m++)
						{
							System.out.print(a[m]+" ");
						}
						System.out.println();
					}
					
				}
				
			}
		}
	}

	public static void main(String[] args)
	{
		
		new ManishEx().subset(6, new int[] {2,5,8,4,6,11}, 13);
	}

}
