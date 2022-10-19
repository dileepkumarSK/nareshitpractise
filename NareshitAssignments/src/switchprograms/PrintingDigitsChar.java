package switchprograms;

public class PrintingDigitsChar 
{

	void print(int i)
	{
		
		int x=i;
			
		
		i=new PrintingDigitsChar().reverse(i); 
		while(i!=0)
		{
			switch(i%10)
			{
			case 0:
				System.out.print("ZERO ");
				break;
			case 1:
				System.out.print("ONE ");
				break;
			case 2:
				System.out.print("TWO ");
				break;
			case 3:
				System.out.print("THREE ");
				break;
			case 4:
				System.out.print("FOUR ");
				break;
			case 5:
				System.out.print("FIVE ");
				break;
			case 6:
				System.out.print("SIX ");
				break;
			case 7:
				System.out.print("SEVEN ");
				break;
			case 8:
				System.out.print("EIGHT ");
				break;
			case 9:
				System.out.print("NINE ");
				break;
				
			}
			i/=10;
		}
		
		if(x%10==0)
		{
			switch(x%10)
			{
			case 0:
				System.out.print("ZERO ");
				break;
			}
		}
		
	}
	

	int reverse(int ri)
	{
		int sum=0;
		
		while(ri!=0)
		{
		
			sum=(sum*10)+ri%10;
			ri/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		new PrintingDigitsChar().print(250);

	}

}
