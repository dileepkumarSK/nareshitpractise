package strings;

public class RemoveParticularChar
{
	String removeGivenChar(String s,char c)
	{
		String m="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=c)
			{
				m+=s.charAt(i);
			}
		}
		return m;
	}
	public static void main(String[] args) 
	{
		System.out.println(new RemoveParticularChar().removeGivenChar("Dileep kumar", 'l'));
		

	}

}
