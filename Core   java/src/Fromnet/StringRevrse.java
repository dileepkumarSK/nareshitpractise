package Fromnet;

public class StringRevrse {

	
	static int x = 10;
	void m2() {
		
		System.out.println("m1 X : "+x);
	}
	String m1(String s)
	{
		char revstr[]=s.toCharArray();
		String ch="";
		for(int i=s.length()-1;i>=0;i--)
		{
		   ch=ch+revstr[i];	
		}
	    
		return ch;
	}
	static {
		System.out.println("Test2 class Static Block");
}
	
	public static void main(String[] args) {
		System.out.println(new StringRevrse().m1("dileep"));
	new StringRevrse().m2();
		System.out.println("main X : "+x);
	
	

	}

}
