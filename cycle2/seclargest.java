import java.util.*;
class seclargest
{
    public static void main(String args[])
    
    {
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int i,large=0,seclarge=0;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
            if(a[i]>large)
            {
                large=a[i];
            }
            seclarge=a[0];
             for(i=0;i<n;i++)
             if(a[i]>seclarge && a[i]<large)
             seclarge=a[i];
        System.out.println("second largest element is"+seclarge);
     }
}
