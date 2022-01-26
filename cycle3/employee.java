import java.util.Scanner;
public class employee {
    String name;
    int empno,emphno;
 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        employee e[]=new employee[10];
        int n;
        System.out.println("Enter the no of employees:");
        n=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++) {
            e[i]=new employee();
            System.out.println("Enter the name of employee "+(i+1)+":");
            e[i].name=sc.next();
            System.out.println("Enter the empno of employee "+(i+1)+":");
            e[i].empno=sc.nextInt();
            System.out.println("Enter the phone no of employee "+(i+1)+":");
            e[i].emphno=sc.nextInt();
            System.out.println();
        }

    
        System.out.println("The details are:\n");
  
        for(int i=0;i<n;i++) {
            System.out.println("Name of employee "+(i+1)+" is: "+e[i].name);
            System.out.println("Employee no of employee "+(i+1)+" is: "+e[i].empno);
            System.out.println("Phone no of employee "+(i+1)+" is: "+e[i].emphno);
            System.out.println();
        }
    }
}
