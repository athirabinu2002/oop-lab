import java.util.*;
 class amstrong
{
    public static void main(String args[])
{
    System.out.println("Enter a three digit number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num,sum=0,rem,orgnum=n;
    while(n>0)
    {
        rem=n%10;
        num=rem*rem*rem;
        sum=sum+num;
        n=n/10;
    }
    if (sum==orgnum)
    {
    System.out.println("Given number is amstrong");
    }
    else
    {
    System.out.println("Given number is not amstrong");   
    }
}
}
