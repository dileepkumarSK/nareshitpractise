package strings;


	//Write a Program to reverse words in a given String?
	//Write a program to Words revers of the Given String?
public class ReverseTheWordInString 
{
	void reversethewords(String s)
	{
		String rev[]=s.split("\\s");
		String revstring="";
		for(int i=rev.length-1;i>=0;i--)
		{
			revstring=revstring+rev[i]+" ";
		}
		
		System.out.println(revstring);
	}
	
	
	void reversethewordsAndChars(String s)
	{
		String rev[]=s.split("\\s");
		String revstring="";
		for(int i=rev.length-1;i>=0;i--)
		{
			revstring=revstring+   this.reverseChars(rev[i]) +" ";
		}
		
		System.out.println(revstring);
	}
	
	
	String reverseChars(String s)
	{
		String revChar="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revChar+=s.charAt(i);
		}
		return revChar;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("hi hello i am fine here what about you");
		System.out.println();
		new ReverseTheWordInString().reversethewords("hi hello i am fine here what about you");
		System.out.println();
		new ReverseTheWordInString().reversethewordsAndChars("hi hello i am fine here what about you");
	}

}
