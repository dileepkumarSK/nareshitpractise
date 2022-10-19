package array;

public class ArrayPattrenByAmzon
{
	void getPattren(int [][] a)
	{
		int  outputArray[]= new int[a.length*a[0].length];
		
		int forincrement=0,row=0,col=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				
				outputArray[forincrement++]=a[row][col++];
				
			}
			
				col=0;
			row++;
			
		}
		for(int i:outputArray)
		System.out.print(i+" ");
	}
	public static void main(String[] args)
	{
		new ArrayPattrenByAmzon().getPattren(new int [][] {{1,2,3},{4,5,6},{7,8,9}});;

	}

}

















