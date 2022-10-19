package strings;

public class CountSmallCaptial
{
	void countingChars(String s)
	{
		int cap=0,small=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				cap++;
			}
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				small++;
			}
		}
		
		
		System.out.println("Captial: "+cap);
		System.out.println("Small  : "+small);
	}

	public static void main(String[] args) 
	{
		
		new CountSmallCaptial().countingChars("DileepKUmar");
	}

}
