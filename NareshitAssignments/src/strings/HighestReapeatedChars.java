package strings;

public class HighestReapeatedChars 
{
	void printhighestReapeatedChar(String s)
	{
		char m[]=s.toCharArray();
		int count=1,highest=0;
		char highchar=' ';
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				if(i==j)
					continue;
				else
				{
					if(m[i]==m[j])
					{
						count++;
						m[j]=' ';
					}
					
					
				}
				
			}
			
			if(highest<count && m[i]!=' ')
			{
				highest=count;
				highchar=m[i];
			}
			
			
			count=1;
		}
		
		
		System.out.println(highchar +" Repeated in "+highest+" times");
	}
	
	
	public static void main(String[] args)
	{
		
		new HighestReapeatedChars().printhighestReapeatedChar("Dillleepppp");
	}

}
