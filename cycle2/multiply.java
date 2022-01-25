import java.util.*;
class multiply
{
	public static void main(String args[])
	{
		int i=0,j=0,sum=0,k;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		Scanner z=new Scanner(System.in);
		System.out.println("Enter number of rows in matrix A:");
		int row1=z.nextInt();
		System.out.println("Enter number of columns in matrix A:");
		int col1=z.nextInt();
		System.out.println("Enter number of rows in matrix B:");
		int row2=z.nextInt();
		System.out.println("Enter number of columns in matrix B:");
		int col2=z.nextInt();
		System.out.println("Enter elements in matrix A:");
		for(i=0;i<row1;i++)
			for(j=0;j<col1;j++)
				a[i][j]=z.nextInt();
		System.out.println("Enter elements in matrix B:");
		for(i=0;i<row2;i++)
			for(j=0;j<col2;j++)
				b[i][j]=z.nextInt();
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				sum=0;
				for(k=0;k<col1;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
			c[i][j]=sum;
			}
		}
		if(col1!=row2)
			System.out.println("Matrix multiplication not possible");
		else
		{
			System.out.println("New matrix is:");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
					System.out.println(c[i][j]);
			}
		}
	}
}
