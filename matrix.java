package javaprograms;

import java.util.*;

 public class matrix{
	
	int rows;
	int columns;
	int array[][];
	
	Scanner sc = new Scanner (System.in);
	
	matrix(int rows,int columns)
	{
		this.rows=rows;
		this.columns=columns;
		this.array= new int[rows][columns];
		
	}
	
	public void getinput()
	{
		for(int i =0;i<rows;i++)
		{
			for(int j =0;j<columns;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
	}
	
	public int matrixmul(matrix m1,matrix m2)
	{
		int flag =0;
		
		if(m1.columns!=m2.rows)
		{
			flag =1 ;
			return flag;
		}
		else {
			for(int i =0; i<m1.rows;i++)
			{
				for(int j =0; j<m2.columns;j++)
				{
					for(int k =0; k<m1.columns;k++)
					{
						array[i][j] += m1.array[i][k] *m2.array[k][j];
					}
				}
			}
			return flag;
		}
	}
	public void printmatrix()
	{
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println(array[i][j] +"");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter the number of rows for matrix 1");
		int rows1 = sc.nextInt();
		System.out.println(" enter the number of columns for matrix 1");
		int columns1 = sc.nextInt();
		
		matrix m1 = new matrix(rows1,columns1);
		System.out.println(" enter the values of matrix 1");
		m1.getinput();
		
		
		System.out.println(" enter the number of rows for matrix 2");
		int rows2 = sc.nextInt();
		System.out.println(" enter the number of columns for matrix 2");
		int columns2 = sc.nextInt();
		
		matrix m2 = new matrix(rows2,columns2);
		System.out.println(" enter the values of matrix 2");
		m2.getinput();
		
		matrix m3 = new matrix (m1.rows,m2.columns);
		
		int flag = m3.matrixmul(m1, m2);
		
		System.out.println(" first matrix");
		m1.printmatrix();
		
		System.out.println(" second matrix");
		m2.printmatrix();
		
		if(flag!=1)
		{
			System.out.println("matrix is");
			m3.printmatrix();
		} else
		{
			System.out.println(" product not possible");
		}
		
		
	}
}