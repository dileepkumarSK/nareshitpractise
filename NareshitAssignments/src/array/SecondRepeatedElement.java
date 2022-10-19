package array;

public class SecondRepeatedElement 
{

	int secondRepeatedElement(int[] a)
	{
		
	
		int count=0,c=0,highest=0,fh=0;
		
		for(int i=0;i<2;i++)
		{
		
			for(int j=0;j<a.length;j++)
			{
				count=0;
				for(int k=0;k<a.length;k++)
				{
					 if(a[j]==fh)
						 continue;
					 else
						if(a[j]==a[k])
							count++;
				}
				
				if( count>c)
				{
					c=count;
				
					highest=a[j];
					
				}	
			}
			c=0;
			fh=highest;
			
		}
		return highest;
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(
				new SecondRepeatedElement().secondRepeatedElement(new int[] {10,10,20,20,20,30,40}));
     }

}
