  package ArraysExam1;

public class SumMatchingElements {
	
	
	void sumOfArrayElemets(int sum,int a[])
	{
		int sum2=0;
	
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				
					sum2+=a[j];
		
				if(sum2==sum)
					for(int k=i;k<=j;k++)
						System.out.print(a[k]+" ");
				System.out.println();
			}
			System.out.println();
			sum2=0;
		}*/
		
		
		
		
		int ll=0;
		for(int k=0;k<a.length;k++) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-(ll+1);j++)
			{
				if(i!=j)
				{
					System.out.println("i: "+a[i]+" J :"+a[j+ll]+"  "+(a[i]+a[j]));	
				}
				
			}
		}ll++;
		}
		
		
		
		
	
	}

	public static void main(String[] args) {
		
		new SumMatchingElements().sumOfArrayElemets(28, new int[] {7,21,11,3,10} );
	}

}
