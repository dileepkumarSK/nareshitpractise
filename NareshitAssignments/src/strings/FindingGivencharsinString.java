package strings;

public class FindingGivencharsinString 
{

	void findingGivenchar(String s,char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println("given '"+c+"' Repeated in "+count+" times");
	}
	public static void main(String[] args)
	{
		
		new FindingGivencharsinString().findingGivenchar("Hi how are u friend!", 'e');
	}

}
