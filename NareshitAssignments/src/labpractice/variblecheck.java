package labpractice;

 




public class variblecheck 
{
	static void m(int [] a)
	{
		a[1]=5;
		a[2]=44;
	}
	
	public static void main(String[] args)
	{
		
		int ll[]= {10,20,30,35,40,48,50};
		m(ll);
		for(int a:ll)
			System.out.println(a);
		System.out.println(ll.length);
		
		
	}
}

	


	
	