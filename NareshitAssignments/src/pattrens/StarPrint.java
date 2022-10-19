package pattrens;

public class StarPrint {
	int cou=1;
	void pattren1(int x)
	{
		System.out.println("pattren no:" + cou++);
		for(int i=1;i<=x;i++)
		{   
			for(int j=1;j<=x;j++)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
	}

	void pattren2(int x)
	{
		System.out.println("pattren no:" + cou++);
		for(int i=1;i<=x;i++)
		{   
			for(int j=1;j<=x;j++)
			{
				if(j<=x-(i-1))
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
	}
	void pattren3(int x)
	{
		System.out.println("pattren no:" + cou++);
		for(int i=1;i<=x;i++)
		{   
			for(int j=1;j<=x;j++)
			{
				if(i==j||j==1||i==x)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("==============================");
	}

	public static void main(String[] args) {
		
		StarPrint sobj=new StarPrint();
		sobj.pattren1(5);
		sobj.pattren2(5);
		sobj.pattren3(5);
	}

}
