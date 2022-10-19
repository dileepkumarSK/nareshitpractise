package labpractice;

public class ThisExample {

	
	ThisExample m1()
	{
		System.out.println("hi hello");
		return this;
	}
	void meth1()
	{
		System.out.println("Called using returnrd object");
	}
	public static void main(String[] args)
	{
		new ThisExample().m1().meth1();
	}
	
	
}
