package ArraysExam1;

public class EvenOrOddArray {
	int findType(int n, int a[])
	{
		int e=0,o=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		if(n==e)
		{
			return 1;
		}
		else if(n==o)
		{
			return 2;
		}
		else 
			return 3;
		
	}
	public static void main(String[] args) {
		
		
			System.out.println(new EvenOrOddArray().findType(5, new int[] {10,27,77,41,55} ));
	}

}
