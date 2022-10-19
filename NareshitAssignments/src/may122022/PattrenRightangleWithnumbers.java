package may122022;

public class PattrenRightangleWithnumbers {
	void numberPattern4(int val)
	{
		for(int i=1;i<=val;i++) 
		{
			int x=i;
			for(int j=1;j<=val;j++)
			{
				if(j<=i)
				{
					System.out.print(" "+x*j+" ");
				}
				else
				{
					System.out.print("   ");
				}
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		new PattrenRightangleWithnumbers().numberPattern4(5);

	}

}
