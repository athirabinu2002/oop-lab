import java.util.*;
class addmatrix
{
	public static void main(String args[])
	{
		int i=0,j=0;
		System.out.println("Enter number of rows in matrix A:");
		Scanner sc=new Scanner(System.in);
		int row1=sc.nextInt();
		System.out.println("Enter number of columns in matrix A:");
		int col1=sc.nextInt();
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		System.out.println("Enter array elements:");
		for(i=0;i<row1;i++)
			for(j=0;j<col1;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter number of rows in matrix B:");
		int row2=sc.nextInt();
		System.out.println("Enter number of columns in matrix B:");
		int col2=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<row2;i++)
			for(j=0;j<col2;j++)
				b[i][j]=sc.nextInt();
		for(i=0;i<row1;i++)
			for(j=0;j<col1;j++)
				c[i][j]=a[i][j]+b[i][j];
		if(row1==row2 && col1==col2)
		{
			System.out.println("New matrix is:");
			for(i=0;i<row1;i++)
				for(j=0;j<col1;j++)
			System.out.println(c[i][j]);
		}
		else
		{
			System.out.println("Matrix addition not possible");
		}
	}
}
