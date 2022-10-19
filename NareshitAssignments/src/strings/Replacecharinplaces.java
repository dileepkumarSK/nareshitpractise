package strings;

public class Replacecharinplaces 
{
	void replacingCharsinspecfic(String s,char orginalchar,String replacechar)
	{
		String m="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==orginalchar)
			{
				m+=replacechar;
			}
			else
			{
				m+=s.charAt(i);
			}
			
			
		}
		
		
		
		System.out.println(m);
	}
	public static void main(String[] args)
	{
		new Replacecharinplaces().replacingCharsinspecfic("Dileep kumar sk", 'k', "@#$mk");

	}

}
