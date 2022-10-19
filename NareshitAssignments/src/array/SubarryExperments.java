package array;

public class SubarryExperments 
{

	public static void main(String[] args) 
	{
		int n=10,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=0;
			for(int j=1;j<=n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					sum+=k;
					//System.out.println(sum);
					if(sum==6)
					{
						for(int l=i;l<=j;l++)
							System.out.println(l);
					}
				}
			}
		}

	}

}
