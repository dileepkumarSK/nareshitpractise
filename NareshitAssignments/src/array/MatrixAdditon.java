package array;

public class MatrixAdditon 
{
	int[][] additon(int[][] a,int[][] b )
	{
		int ad[][] =new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				ad[i][j]=a[i][j]+b[i][j];
			}
		}
		return ad;
	}

	public static void main(String[] args)
	{
		int[][] aa=new int[3][3];
		aa =new MatrixAdditon().additon(new int [][] {{1,2,3},{1,5,4}}, new int [][] {{1,2,3},{1,5,4}});
		System.out.println("Additioon of matrix");
		System.out.println();
		
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa[0].length;j++)
			{
					System.out.print(aa[i][j]+" ");	
				
			}
			System.out.println();
		}
		
		System.out.println("=================================");
	}

}
