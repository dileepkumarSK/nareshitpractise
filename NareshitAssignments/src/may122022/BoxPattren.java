package may122022;
import may102022.BollentrueORfalse;
public class BoxPattren extends BollentrueORfalse {
	final int o=100;
	void createBoxPattern(int row,int col)
	{
		for(int i=1;i<=row;i++) 
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||j==1||j==col||i==row)
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
		
		new BoxPattren().createBoxPattern(5, 5);
		System.out.println(new BoxPattren().countBoolean(false, false, false));
		

            int a = 10;

            int b = 2;

            System.out.println((a < b) ? a++ : --b);
            

}
			
	

}
