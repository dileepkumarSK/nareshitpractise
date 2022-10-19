package may242022;

public class Karpernumber {

	String isKaprekarNumber(int number)
	{
		
		
		int totaldigits=1,squarenumber;
		squarenumber=number*number;
		int orginalnumber=number;
			
		while(number!=0)
		{   number/=10;
			totaldigits*=10;
		}
		
		int check= new Karpernumber().sum(squarenumber,totaldigits++);
		
		
		if(orginalnumber==check)
		  return "true ";
		else
		{
			return "false";
		}
	}
	
	int sum(int i,int x)
	{	
		
		
		int firstnumber=i%x;
		
		System.out.println("firstnumber "+firstnumber);
		int secondnumber=i/x;
		System.out.println("secondnumber "+secondnumber);
		int number=secondnumber+firstnumber;
		System.out.println("number "+number);
		
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(new Karpernumber().isKaprekarNumber(297));

	}

}
