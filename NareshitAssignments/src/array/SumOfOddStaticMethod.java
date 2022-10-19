package array;

import java.util.Scanner;

public class SumOfOddStaticMethod 
{
     static String getOddCount(int a[])
    {
    	 int odd=0,even=0,negative=0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]%2==0)
    		 {
    			 if(a[i]<=0)
    			 {
    				 negative=1; 
    			 }
    			 even++;
    		 }
    		 else 
    		 {
    			 odd++;
    		 }
    	 }
    	System.out.println(odd);
    	if(a.length>5)
    	{
    		return "-1";
    	}
    	else if(negative==1)
    	{
    		return "-2";
    	}
    	else if(even==5)
    	{
    		return "-3";
    	}
    	else 
    	{
    		return "odd";
    	}
		
    }
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("size of arry");
		int len=s.nextInt();
		int arry[]=new int[len];
		
		for(int i=0;i<arry.length;i++)
		{   
			System.out.println("enter number :"+ (i+1));
			arry[i]=s.nextInt();
		}
		for(int i=0;i<arry.length;i++)
		{   
			System.out.print(arry[i]+" ");
		
		}
		System.out.println(SumOfOddStaticMethod.getOddCount(arry));
		
		s.close();
	}

}
