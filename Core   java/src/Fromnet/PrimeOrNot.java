package Fromnet;

public class PrimeOrNot {

	String prime(int x)
	{   int m=0;
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0) 
			{
				m=1;
				break;
			}
		}
		if(m!=1)
		{
			return "prime";
		}
		else
		{
			return "Not Prime";
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new PrimeOrNot().prime(6));

	}

}
