package pattrens;

public class Numberspat {

	void pat()
	{
		int m=5,k;
		for(int i=1;i<=5;i++)
		{   
			int sum=0;
			k=m--;
			int t=4;
			for(int j=1;j<=5;j++)
			{
				if(j+i<=6)
				{
					if(j==1)
					{
						sum=k;
						System.out.print(sum+" ");
					}
					else
					{
						sum+=t--;
						System.out.print(sum+" ");
					}
				}
			}
			
			System.out.println();
		}
	}
	void pat2()
	{
		int m=0,k;
		for(int i=1;i<=5;i++)
		{   
			m+=i;
			k=m;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(k--+" ");
				}
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Numberspat().pat2();
	}
}
