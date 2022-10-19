package array;

public class SumOfGivenSumEquals {

	void printArray(int n,int[] a)
	{
		int swap;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-1)-i;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			int count=0,sum=0;
			
		}
		
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
		
	

	public static void main(String[] args) {
		new SumOfGivenSumEquals().printArray(0, new int[] {1,5,3,8,3,6});

	}

}
