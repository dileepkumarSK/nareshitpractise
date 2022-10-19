package test1;

public class Problem_3 {
 int sumprime(int x,int y)
 {
	 if(x<0 || y<0) 
	 {
		 return -2;
	 }
	 else if(x==0 || y==0)
	 {
	   return -1;	 
	 }
	 else if(x>=y )
	 {
		 return -3;
	 }
	 else 
	 {
		 int sum=0;
		for(int i=x;i<=y;i++)
		{   if(i==2)
		{
			sum=sum+i;
		}
			else if(i%2==0 || i==1) {
				continue;
			}
			else
			{   int ch=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						ch=1;
						
						break;
					}
				}
				if(ch!=1)
				{
					sum+=i;
				}
				
			}
		 	
		}
		return sum;
	 }
 }
	
	
	public static void main(String[] args) {
		System.out.println(new Problem_3().sumprime(1, 30));

	}

}
