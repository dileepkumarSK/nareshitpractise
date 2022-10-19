package array;

public class ReaptedAndUnique {

	void findelemets(int [] a)
	{
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j||a[i]==-3)
					continue;
				else
				{
					if(a[i]==a[j])
					{
						count++;
						a[j]=-3;
					}
				}
			}
			if(a[i]==-3)
				continue;
			if(count==1)
			{
				System.out.println(a[i]+ "    unique ");
			}
			else 
			{
			System.out.println(a[i]+"    "+"repeated");
			}
			count=1;
		}
	}
	public static void main(String[] args) {
		new ReaptedAndUnique().findelemets(new int[] {10,5,5,3,3,2}); 

	}

}
