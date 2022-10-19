package labpractice;

public class Constructor {

	Constructor()
	{
		
		System.out.println("hi hi ho");
	}

	Constructor(int  i)
	{
		this();
		System.out.println("hi hidddds ho");
	}
	
	
	public static void main(String[] args) {
		new Constructor(3);
	}

}
