import java.util.*;
 class sumnatural
{
    public static void main(String args[])
{
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0,i;
    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    System.out.println("sum is"+sum);
}
}
