import java.util.*;
 class oddven
{
    public static void main(String args[])
{
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0)
    {
        System.out.println("Given number is even");
    }
    else
    {
     System.out.println("Given number is odd");   
    }
}
}
