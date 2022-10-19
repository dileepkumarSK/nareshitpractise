package normal;

public class PrimeOrNot {
	
	void isPrime(int x,int y)
	{
		int m=0;
		for(int i=x;i<=y;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					m=1;
					break;
				}
			}
			if(m==0)
				System.out.print(i+" ");
			m=0;
		}
	}

	public static void main(String[] args) {
		
		new PrimeOrNot().isPrime(2, 20); 
	}

}
