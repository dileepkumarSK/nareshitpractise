package strings;

public class RemoveCharFromString 
{
	String newstring="";
	String deletechar(String s,char c)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=c)
			{
				newstring+=s.charAt(i);
				
			}
		}
		return newstring;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(new RemoveCharFromString().deletechar("Dilefep fKumar", 'f'));
	}

}
