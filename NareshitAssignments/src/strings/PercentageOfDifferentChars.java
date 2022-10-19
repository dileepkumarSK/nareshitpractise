package strings;

public class PercentageOfDifferentChars 
{
	void findpercentageofchar(String s)
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
		
		/*
			System.out.println("Chars: "+ charscount);
			System.out.println("Digits: "+ digits);
			System.out.println("Specia Chars: "+(s.length()- (charscount+digits)));
			System.out.println();
		*/
		
		System.out.println("Percnetage of chars: "+(charscount*100/s.length()));
		System.out.println("Percnetage of Digits: "+(digits*100/s.length()));
		System.out.println("Percnetage of Special chars: "+((s.length()-(charscount+digits))*100/s.length()));
	}
	
	public static void main(String[] args)
	{
		
		new PercentageOfDifferentChars().findpercentageofchar("DIleep@@123");
	}

}
