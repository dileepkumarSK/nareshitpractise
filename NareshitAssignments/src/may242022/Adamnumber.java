package may242022;

public class Adamnumber {

	boolean isAdamNumber(int number)
	{
		int revnumber=new Adamnumber().rev(number);
		
		if(number*number==revnumber)
			return true;
		else
			return false;
		
	}
	
	int rev(int number)
	{ 	int revnumber=0;
	
		while(number!=0) 
		{
			revnumber=revnumber*10+number%10;
			number/=10;
		}
		return revnumber*revnumber;
	}
	
	public static void main(String[] args) {
		System.out.println(new Adamnumber().isAdamNumber(13));
		
	}

}
