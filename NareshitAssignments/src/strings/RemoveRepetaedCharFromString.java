package strings;

public class RemoveRepetaedCharFromString
{
	
	String removeREpetatedchars(String s)
	{
			
		int count=0;
		String m="";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{	
			for(int j=0;j<s.length();j++)
			{
				
					if(c[i]==c[j])
						count++;
				
			}
			if(count>1)
			{
				c[i]=' ';
			}
			
			count=0;
			
		}
		
			
			for(int j=0;j<s.length();j++)
			{
				
					if(c[j]!=' ')
						m+=c[j];
				
			}
			
			
		
		return m;
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		System.out.println(new RemoveRepetaedCharFromString().removeREpetatedchars("Dileep"));
	}

}
