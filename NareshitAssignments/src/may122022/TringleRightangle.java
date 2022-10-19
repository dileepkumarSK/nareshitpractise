package may122022;

public class TringleRightangle {
	void createStarPattern(int val)
	{
		for(int i=1;i<=val;i++) 
		{
			for(int j=1;j<=val;j++)
			{
				if(j<=i)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}System.out.println();
		}
	}
	

	public static void main(String[] args) {
		new TringleRightangle().createStarPattern(5);

	}

}
