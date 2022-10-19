package array;

import java.util.Scanner;

public class MatrixAddtion 
{
	Scanner sc=new Scanner(System.in);
	int[][] matrixInputTwoDimensional()
	{	
		System.out.println("Enter the col & rows of matrix");
		int c=sc.nextInt();
		int r=sc.nextInt();
		int matrix[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Eneter the "+i+" & "+j+" element");
				matrix[i][j]=sc.nextInt();
			}
			
		}
		
		return matrix;
	}
	void addition(int[][] m1,int[][] m2)
	{
		int[][] additonmatrix=new int[m1.length][m1[0].length];
		
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[0].length;j++)
			{
				additonmatrix[i][j]=m1[i][j]+m2[i][j];
			}
			
		}
		
		
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[0].length;j++)
			{
				System.out.print(additonmatrix[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		int[][] matrix1=new MatrixAddtion().matrixInputTwoDimensional();
		int[][] matrix2=new MatrixAddtion().matrixInputTwoDimensional();
		System.out.println();
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[0].length;j++)
			{
				System.out.print(matrix1[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i=0;i<matrix2.length;i++)
		{
			for(int j=0;j<matrix2[0].length;j++)
			{
				System.out.print(matrix2[i][j]+" ");
				
			}
			System.out.println();
			
		}
		System.out.println();
		new MatrixAddtion().addition(matrix1, matrix2);
	}

}
