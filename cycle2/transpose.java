import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter number of columns:");
		int col=sc.nextInt();
		int a[][]=new int[50][50];
		System.out.println("Enter array elements:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Transpose matrix is:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				System.out.println(a[j][i]);
	}
}
