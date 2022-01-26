import java.util.*;
public class perimeter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int a = sc.nextInt();
        System.out.println("Enter the length of rectangle :");
        int b = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :");
        int c = sc.nextInt();
        perimeter obj=new perimeter(a);
        perimeter obj1=new perimeter(b,c);
        sc.close();
    }
    perimeter(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    perimeter(int n,int m)
    {
        int p=n+m;
        int t=2*p;
        System.out.println("Perimeter  of Rectangle is:"+t);
    }
} 
