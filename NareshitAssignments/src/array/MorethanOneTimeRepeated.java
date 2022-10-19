package array;

public class MorethanOneTimeRepeated 
{
	public int repeated(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
					continue;
				else
					if(a[i]==a[j])
						count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println();
		
		
	
		System.out.println(new MorethanOneTimeRepeated().repeated(new int[] {10,20,50,10,20}));
	}

}
