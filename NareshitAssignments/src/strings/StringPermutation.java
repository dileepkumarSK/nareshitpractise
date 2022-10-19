package strings;

public class StringPermutation
{

	void permutation(String s)
	{
		String pervar="";
		for(int i=0;i<s.length();i++)
		{
			
			for(int k=0;k<s.length();k++)
			{
				if(i==k)
					continue;
				
				else
				{
					for(int j=0;j<s.length();j++)
					{
						if(j==k)
							continue;
						else
							pervar=pervar+s.charAt(i)+s.charAt(k)+s.charAt(j);
						
					}
					System.out.println(pervar);
					pervar="";
					
				}
				
			}
			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		new StringPermutation().permutation("abc");
	}

}
