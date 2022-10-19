package strings;

public class DuplicatesPrinting 
{
	void printDuplicates(String s)
	{
		char m[]=s.toCharArray();
		int count=1;
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
			if(count>1 && m[i]!=' ')
			{
				
				System.out.println(m[i]+" : "+count );
				
			}
			count=1;
			
			
		}
	}
	public static void main(String[] args) 
	{
		new DuplicatesPrinting().printDuplicates("HI hello how are");

	}

}
