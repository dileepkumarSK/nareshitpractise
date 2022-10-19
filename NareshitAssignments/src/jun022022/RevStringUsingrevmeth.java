package jun022022;

public class RevStringUsingrevmeth {

	
	void usingTochar(String s)
	{
		StringBuffer ss=new StringBuffer(s);
		System.out.println(ss.reverse()+" ");
	}
	
	public static void main(String[] args)
	{
		
		String s="DILEEP";
		
		
		new RevStringUsingrevmeth().usingTochar(s);
	}
	
}
