package strings;

public class EqualItemsInStringArray 
{

	void equalElements(String []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j || a[i]==null)
					continue;
				else
				{
					if(a[i]==a[j] )
					{
						System.out.println(a[i]);
						a[j]=null;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new EqualItemsInStringArray().equalElements(new String[] {"Dileep","Dileep","Raju","arun"});

	}

}
