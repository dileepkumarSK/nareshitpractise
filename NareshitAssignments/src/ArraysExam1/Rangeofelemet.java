package ArraysExam1;

public class Rangeofelemet {

	int  findrange(int a[])
	{
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		
		return max-min;
	}
	
	public static void main(String[] args) {
		int a[]= {10,5,4,7,5};
		System.out.println(new Rangeofelemet().findrange(a));
		

	}

}
