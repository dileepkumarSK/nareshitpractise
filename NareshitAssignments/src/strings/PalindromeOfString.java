package strings;

public class PalindromeOfString
{

	boolean isStringPalindrome(String s)
	{
		
		int check=0,revtemp=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(revtemp--))
			{
				
				check=1;
				break;
			}	
		}
		
		if(check==1)
		{
			return false;	
		}
		else
		{
			return true;
		}
			
			
		
	}
	public static void main(String[] args) 
	{
		
		
		System.out.println(new PalindromeOfString().isStringPalindrome("dilmmlid"));
	}

}
