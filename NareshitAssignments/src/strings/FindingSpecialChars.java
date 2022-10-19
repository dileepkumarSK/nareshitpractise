package strings;

public class FindingSpecialChars
{	
	void findSpecialchars(String s)
	{
		int check=0;
		for(int i=0;i<s.length();i++)
		{
			if(  s.charAt(i)>='A' && s.charAt(i)<='Z' ||s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>=0 &&  s.charAt(i)<=9)
			{
				
				check++;
			
			}
			
			
		}
		
	
		if(check!=s.length())
		{
			System.out.println("Given String contain Special Chars");
		}
		else
		{
			System.out.println("Given String not Contains Special Chars");
		}
	}

	public static void main(String[] args) 
	{
		
		new FindingSpecialChars().findSpecialchars("DILEEPc");
	}

}
