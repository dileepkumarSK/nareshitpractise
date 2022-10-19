package strings;

public class CountingOvwelConsonents 
{	
	void countOvelsConsonants(String s)
	{
		int owvels=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
					||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
					||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				owvels++;
			}
		}
		
		System.out.println("Ovwels: "+owvels);
		System.out.println("Consonents: "+(s.length() -owvels));
		System.out.println();
		System.out.println("Percentage Ovwels: "+(owvels*100)/s.length());
		System.out.println("Percentage Consonents: "+((s.length() -owvels)*100)/s.length());
		
	}

	public static void main(String[] args) 
	{
		new CountingOvwelConsonents().countOvelsConsonants("Dileep");
		
	}

}
