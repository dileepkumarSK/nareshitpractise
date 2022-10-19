package jun022022;

public class ResvStringTochar {

	
	public void revTochar(String s)
	{
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		String SS="Dileep ";
		new ResvStringTochar().revTochar(SS);
	}
}
