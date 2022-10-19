package test1;

public class Problem_2 {
    int getFactorial(int n)
    {  
    	int fact=1;
       for(int i=n;i>1;i--)
       {
    	fact*=i;
    	
       }
    
	 if(n<0) 
	 {
		 return -2;
	 }
	 else if(n==0)
	 {
	   return -1;	 
	 }
	 else {
		 return fact;
	 }
     
    }	public static void main(String[] args) {
		System.out.println(new Problem_2().getFactorial(5));
	}

}
