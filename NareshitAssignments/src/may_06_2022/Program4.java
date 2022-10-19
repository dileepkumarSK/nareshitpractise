package may_06_2022;
/*
 Define a method which returns the number it if it is an even number, if the number is odd then return the next multiple of 10.
Write the method with the following specifications: 
Name of method: oddRounder() // which accepts an integer value as argument and return the same value if it is an even number, if the value is odd then return the next multiple of 10. 
Arguments: one argument of type integer
Return Type: an integer value 
Example if x = 24 then return 24, if x = 25 then return 30.
Specifications: The value returned by the method oddRounder() is determined by the following rules:
If any of the given number is negative, return -1.
If any of the given number is zero, return -2.
If the given number is even, return the same number.
If the given number is odd, return the next multiple of 10.
*/
public class Program4 {

	int oddRounder(int n)
	{
		if(n==0)
		{
			return -2;
		}
		else if(n<0 )
		{
			return -1;
		}
		else
		{
			if(n%2==0) 
			{
				return n;
			}
			else 
			{
				return ((n/10)+1)*10;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(new Program4().oddRounder(15));

	}

}
