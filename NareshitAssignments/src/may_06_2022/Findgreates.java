package may_06_2022;



/*
 * 
 * Program-2
_______________
Define a method which returns the greatest number among two numbers.
Write the method with the following specifications: 
Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
Arguments: two argument of type integer
Return type: an integer value 
Specifications: The value returned by the method getGreatest() is determined by the following rules:
If any of the given numbers are negative, return -1.
If any of the given numbers are zero, return -2.
If the given numbers are positive, return the greatest.
-------------------------------------------------------------------------------------------------------------------------------------------
Program 3
_______________
Define a method which returns the least number among two numbers.
Write the method with the following specifications: 
Name of method: getLeastNum() // which accepts two integer values as argument and return the least value.
Arguments: two argument of type integer
Return type: an integer value 
Specifications: The value returned by the method getLeastNum() is determined by the following rules:
If any of the given numbers are negative, return -1.
If any of the given numbers are zero, return -2.
If the given numbers are positive, return the least number.
*/
public class Findgreates 
{
	
	int getleast(int n,int m)
	{
		if(n==0||m==0)
		{
			return -2;
		}
		else if(n<0 ||m<0)
		{
			return -1;
		}
		else
		{
			if(n<m) 
			{
				return n;
			}
			else 
			{
				return m;
			}
		}
	}
	
	
	
	int getGreatest(int n,int m)
	{
		if(n==0||m==0)
		{
			return -2;
		}
		else if(n<0 ||m<0)
		{
			return -1;
		}
		else
		{
			if(n>m) 
			{
				return n;
			}
			else 
			{
				return m;
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println(new Findgreates().getleast(25, 400));

	}

}
