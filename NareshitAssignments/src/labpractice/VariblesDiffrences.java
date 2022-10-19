package labpractice;

public class VariblesDiffrences
{
	static int x=0;
	void instance()
	{
		
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new VariblesDiffrences().instance();
		new VariblesDiffrences().instance();
		new VariblesDiffrences().instance();
		new VariblesDiffrences().instance();
	
	}
	
}
