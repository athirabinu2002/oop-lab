import java.util.*;
 class prime
{
    public static void main(String args[])
{
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int i,count=0;
    if(num>1)
    {
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;
        }
    if
    (count==2)
    System.out.println("Given number is prime");
    else
    System.out.println("Given number is not prime");   
    }
    else
    System. out.println("Given number is not prime");
}
}
