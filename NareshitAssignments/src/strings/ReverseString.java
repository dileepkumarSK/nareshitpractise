package strings;

public class ReverseString 
{
	String reverse(String s)
	{
		String m="";
		for(int i=s.length()-1;i>=0;i--)
			m+=s.charAt(i);
		return m;
	}

	public static void main(String[] args) 
	{
		
		
		System.out.println(new ReverseString().reverse("Dileep"));
	}

}
