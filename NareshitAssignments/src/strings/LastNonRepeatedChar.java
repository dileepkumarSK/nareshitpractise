package strings;

public class LastNonRepeatedChar {

	char lastNonREpetated(String s)
	{
			
			int count=0;
			char c=' ';
		for(int i=0;i<s.length();i++)
		{	
			for(int j=0;j<s.length();j++)
			{
				if(i==j)
					continue;
				else
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count=1;
						
					}
				}
			}
			if(count!=1)
			{
				c=s.charAt(i);
				
			}
			
			count=0;
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new LastNonRepeatedChar().lastNonREpetated("SAi kumar Rnajioth"));
	}

}
