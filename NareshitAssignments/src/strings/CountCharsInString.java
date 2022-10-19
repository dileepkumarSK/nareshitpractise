package strings;

public class CountCharsInString 
{
	void countChars(String s)
	{
		int count=0,j;
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(j=0;j<s.length();j++)
			{
				
				if(a[i]==a[j])
					{
						
						count++;
						if(count>1)
						{
							a[j]=' ';

						}
											}	
				}
				if(count>=1 && a[i]!=' ')
				{
					System.out.println(a[i] +" :  "+count );
				}
				
			
			
			count=0;
		}
		
	
	}
	public static void main(String[] args) 
	{
		new CountCharsInString().countChars("Dileeep");

	}

}
