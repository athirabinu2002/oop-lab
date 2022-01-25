//Java program to create a class employee with details such as empno, name and phone number. Read details of at least 5employees and print
import java.util.*; 
class emplo
 { 
  public static void main(String args[])
   {
    Scanner obj=new Scanner(System.in);
    for(int i=1;i<=5;i++)
    { 
      System.out.println("Details of employee "+i);
      System.out.println("Enter the employee number:");
      int n=obj.nextInt();
      System.out.println("Enter the employee Name:");
      String name=obj.next();
      System.out.println("Enter the employee's phone number:");
      String y=obj.next();
    }
   }
} 
