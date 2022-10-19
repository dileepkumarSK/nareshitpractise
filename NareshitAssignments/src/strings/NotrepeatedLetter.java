package strings;

public class NotrepeatedLetter {

	
	void nonRepated(String s)
	{	int count=0;
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
				System.out.println(s.charAt(i));
				return;
			}
			
			count=0;
		}
	}
	
	public static void main(String[] args) {
		
		new NotrepeatedLetter().nonRepated("statitics");
	}

}
