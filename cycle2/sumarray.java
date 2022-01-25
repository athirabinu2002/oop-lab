import java.util.*;
class sumarray 
{
  public static void main (String args[])
  {

     System.out.println("Enter the number of elements in an array: ");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
      int a[]=new int[50];
      int sum=0,i; 
      
      System.out.println("Enter the array elements: ");
      for(i=0;i<n;i++)
         {
           a[i]=sc.nextInt(); 
           sum=sum+a[i];
         }
      System.out.println("Sum of the array elements ="+sum);
   }
 }
