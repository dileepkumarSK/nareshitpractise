package may242022;

public class PerfectNumber {

	int sumOfProperDivisors(int number){
		{   int sum=1,i; 
			
			for(i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					sum+=i;
				}
			}
			
			if(sum==number)
			{
				return 0;
			}
			else if(sum==0)
			{
				return -3;
			}
			else if(sum<0)
			{
				return -2;
			}
			else if(sum>number)
			{
				return 1;
			}
			else 
			{
				return -1;
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(new PerfectNumber().sumOfProperDivisors(28) );
	}

}
