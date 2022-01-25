import java.util.*;
class largestelement
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col=sc.nextInt();
        int a[][]=new int[50][50];
        int i,j;
    System.out.println("Enter the matrix elements:");
    for(i=0;i<row;i++)
    for(j=0;j<col;j++)
    a[i][j]=sc.nextInt();
    int large=a[0][0];
    for(i=0;i<row;i++)
    for(j=0;j<col;j++)  
    {
        if(a[i][j]>large)
        large=a[i][j];
    }
    System.out.println("larges element is:"+large);
    }
}
