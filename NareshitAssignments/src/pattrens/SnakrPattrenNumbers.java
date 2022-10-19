package pattrens;

public class SnakrPattrenNumbers {

	
	int a=1,b=8,c=0;
	void pat1(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if(j<=i)
				{
					System.out.print(a-c +" ");
				}
			}
			
			if(i%2==0)
			{
				a++;
			}
			else
			{
				a+=b;
				b-=4;
				
			}
			
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		new SnakrPattrenNumbers().pat1(5);
	}

}
