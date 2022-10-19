package abstraction;

public class TestingAbstraction extends  CheckingAbstraction {
	@Override
	void startingmessage() {
		System.out.println("Start");
	}
	
	void middlegmessage()
	{
		System.out.println("Middle class");
	}
	
	void addition()
	{
		System.out.println("Addition");
	}
	
	void lastgmessage()
	{
		System.out.println("last");
	}

	public static void main(String[] args) {
		CheckingAbstraction obj=new TestingAbstraction();
		obj.middlegmessage();
	}
	
}
