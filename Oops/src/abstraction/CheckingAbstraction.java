package abstraction;

public abstract class CheckingAbstraction {

	CheckingAbstraction()
	{
		System.out.println("hi");
	}
	
	
	CheckingAbstraction(int x)
	{
		System.out.println(x);
	}
	abstract void startingmessage();
	
	abstract void middlegmessage();
	abstract void addition();
	
	abstract void lastgmessage();
	
	static 
	{
		System.out.println("Static");
		
	}
	
	{
		System.out.println("HI  dsd");
	}
}
