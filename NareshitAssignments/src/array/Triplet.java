package array;

public class Triplet {
	
	boolean findTriplet(int a[],int num)
	{
		boolean res=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==num||i==j)
					continue;
				else
				{
					if(num*num==(a[i]*a[i])+(a[j]*a[j]))
						res=true;	
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(new Triplet().findTriplet(new int []{3,2,4,6,5}, 2));
		
	}

}
