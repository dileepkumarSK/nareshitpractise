package may_06_2022;

 public class IevenClass
{
	 
	 public int isEven(int n) 
	{
		if(n%2==0)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(new IevenClass().isEven(15) );

	}

}
