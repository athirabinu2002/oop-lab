import java.util.*;
 class factor
{
    public static void main(String args[])
{
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
   System.out.println("factors are");
      for(i=1;i<=n;i++)
    {
        if(n%i==0)
    {
    System.out.println("\n"+i);
    }
    }
}
}
