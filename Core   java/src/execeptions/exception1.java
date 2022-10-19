package execeptions;

public class exception1 
{
	void execption1()
	{
		System.out.println("exception first:1");
		try
		{
			int k=10;
			if(k>18)
			throw new myexception("ur not eleigible") ;
		}
		catch(myexception e)
		{
			System.out.println(e.getMessage());
		
		}

	}
	
	public static void main(String[] args)
	{
		new exception1().execption1();
	}
	
}
