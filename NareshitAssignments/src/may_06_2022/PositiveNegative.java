package may_06_2022;
/*
 Program4
 
 Define a method which returns the 1 if the given number is positive, return -1 if the given number is negative, return 0 if the given number is 0.
Name of method findSign() 
Arguments: one argument of type integer
Return Type: an integer value 
Test Cases
1.	If any of the given number is positive, return 1.
2.	If any of the given number is negative, return -1.
3.	If any of the given number is zero, return 0.

  */

public class PositiveNegative {
    int findSign(int n)
    {
    	if(n==0)
    	{
    		return 0;
    	}
    	else if(n<0)
    	{
    		return -1;
    	}
    	else
    	{
    		return 1;
    	}
    		
    }
	
	public static void main(String[] args) {
		System.out.println(new PositiveNegative().findSign(26));
	}

}
