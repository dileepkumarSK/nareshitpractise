package strings;

public class CountOfString 
{
	void countOFchars(String s)
	{	
		int charscount=0,digits=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{	
				digits++;
			}
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')|| (s.charAt(i)>='a' && s.charAt(i)<='z'))
			{	
				 charscount++;
			}
		}
		
		
		
		System.out.println("Chars: "+ charscount);
		System.out.println("Digits: "+ digits);
		System.out.println("Specia Chars: "+(s.length()- (charscount+digits)));
		
	}
	public static void main(String[] args)
	{
	
		new CountOfString().countOFchars("Dileep@gmail123");
	}

}
