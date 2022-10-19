package strings;

public class CountGivenWordsinString
{
	int countword(String s)
	{
		int count=0;
		for(int i=0;i<=s.length()-4;i++)
		{
			if(s.charAt(i)=='c' && s.charAt(i+1)=='o'&&s.charAt(i+3)=='e')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(new CountGivenWordsinString().countword("codehhggcodejjjjjhhcodejjjjjcovekcode"));
	}

}
