package strings;

public class SortingString
{
	void stringSoring(String s)
	{
		char m[]=s.toCharArray();
		char temp;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=0;j<(s.length()-1)-i;j++)
			{
				if(m[j]>m[j+1])
				{
					temp=m[j+1];
					m[j+1]=m[j];
					m[j]=temp;
				}
			}
		}
		for(char i:m)
			System.out.print(i+" ");
	}
	public static void main(String[] args)
	{
		new SortingString().stringSoring("ecdab");
	}

}
