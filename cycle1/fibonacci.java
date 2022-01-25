import java.util.*;
 class fibonacci
{
    public static void main(String args[])
{
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,sum=0,a=0,b=1;
    for(i=1;i<=n;i++)
    {
    System.out.println(a);
    sum=a+b;
    a=b;
    b=sum;
    }
}
}
