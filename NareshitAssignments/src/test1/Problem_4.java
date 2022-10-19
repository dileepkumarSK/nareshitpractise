package test1;

public class Problem_4 {
	int getSumOfFactors(int n) {
		int sum=1+n;
		
		if(n<0) 
		 {
			 return -2;
		 }
		 else if(n==0)
		 {
		   return -1;	 
		 }
		 else
		 {
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					sum+=i;
				}
			}
		 }
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(new Problem_4().getSumOfFactors(6));
	}

}
