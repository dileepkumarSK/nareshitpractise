package vishu;

public class FirstProgram1 
{
	void bags(int []a,int bags)
	{
		int tem=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-i)-1;j++)
			{
				if(a[j]>a[j+1])
				{
					tem=a[j+1];
					a[j+1]=a[j];
					a[j]=tem;
				}
			}
			
		}
		int sum=0,possible=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<(a.length-i);j++)
			{
				sum+=j;
				if(sum+(j+1)>=10)
				{
					possible+=sum;
					break;
				}
				
			}
			sum=0;
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new FirstProgram1().bags(new int[]{3,4,5}, 2); 
	}
}
