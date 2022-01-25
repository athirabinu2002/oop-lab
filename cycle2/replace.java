import java.util.*;
class replace
{
    public static void main(String args[])
    
    {
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[50];
        int i;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the location in which number to be replaced");
        int x=sc.nextInt();
        System.out.println("Enter the number to be replaced");
        int y=sc.nextInt();
        a[x]=y;
        System.out.println("New array is");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
     }
}
