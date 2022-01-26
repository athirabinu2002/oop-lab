class areas
import java.util.*;
public class areas
{
    public static void main(String args[])
    {
        areas obj=new areas();
        obj.area(5);
        obj.area(4,5);
        obj.area(4.5,5.5);
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle /2.Rectangle / 3.Triangle");
        System.out.println("Select an option(1/2/3) :");
        int a = sc.nextInt();
        areas obj = new areas();
        if (a==1)
        {
            System.out.println("Enter the radius :");
            int r =sc.nextInt();
            obj.area(r);
        }
        else if (a==2)
        {
            System.out.println("Enter the length :");
            int l =sc.nextInt();
            System.out.println("Enter the breadth :");
            int b =sc.nextInt();
            obj.area(l,b);
        }
        else if (a==3) 
        {
            System.out.println("Enter the base :");
            double x =sc.nextDouble();
            System.out.println("Enter the height :");
            double y =sc.nextDouble();
            obj.area(x,y);
        }
        else 
            System.out.println("Error");
        sc.close();
    }
    void area(int r)
    void area(int a)
    {
        System.out.println("Area of circle is:"+(3.14*r*r));
        System.out.println("Area of circle is:"+(3.14*a*a));
    }
    void area(int l,int b)
    void area(int n,int m)
    {
        System.out.println("Area of Rectangle is:"+(l*b));
        System.out.println("Area of Rectangle is:"+(n*m));
    }
    void area(double a,double b)
    void area(double c,double d)
    {
        System.out.println("Area of triangle is:"+(0.5*a*b));
        System.out.println("Area of triangle is:"+(0.5*c*d));
    }
}
