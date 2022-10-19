package strings;

public class AnogramStringChecking 
{
	void isStringAnogram(String s1,String s2)
	{
		int check=0;
		if(s1.length()!=s2.length())
		{
			System.out.println("Not a Anogram");
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						check++;
						break;
					}
				}
				
			}
			
			
			if(check!=s2.length())
			{
				System.out.println("Not a Anogram");
			}
			else
			{
				System.out.println("Anogram");
			}
		}
	}
	public static void main(String[] args)
	{
		
		new AnogramStringChecking().isStringAnogram("Dileep", "lDeepi");
	}

}
