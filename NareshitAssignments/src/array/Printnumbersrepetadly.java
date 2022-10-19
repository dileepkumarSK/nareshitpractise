package array;

public class Printnumbersrepetadly {

	public static void main(String[] args) {
		
		int [] a=new int[21];
		int m=0,n=1,x=1;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<x;j++)
			{
				a[m++]=n;
			}
			x++;
			n++;
		}

		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		
	}

}
