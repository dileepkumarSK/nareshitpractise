package jun022022;

public class ForrevserseString {

	public void usingFOr(String s)
	{
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		
		String s="Dileep";
		new ForrevserseString().usingFOr(s);
	}

}
