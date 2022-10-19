package strings;

public class FindingDigitsInString 
{	
	void findDigits(String s)
	{
		int check=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				
				check=1;
				break;
			}
		}
		
		if(check!=1)
		{
			System.out.println("Given String not contain Digits");
		}
		else
		{
			System.out.println("Given String Contains Digits");
		}
	}

	public static void main(String[] args) 
	{
		
		new FindingDigitsInString().findDigits("Dileep");
	}

}
