import java.util.*;
public class Employee
{
    String name,addr,phone;
    int age,salary;
    
    static Officer o=new Officer();
    static Manager m=new Manager();
    void print_Salary(int salary)
    {
        System.out.println(salary);
    }
    public static void main(String args[])
    {      
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Details of Officer");
        o.input();
        System.out.printf("Enter the specialization:");
        o.specialization=scan.next();
        
        System.out.println("Enter the Details of Manager");
        m.input();
        System.out.println("Enter the department:");
        m.dept=scan.next();
        o.details();
             
        System.out.print("Salary of officer:");
        o.print_Salary(o.salary);
        m.details();
        System.out.print("Salary of manager:");
        m.print_Salary(m.salary);      
    }

    void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the name : ");
        name=scan.nextLine();
        System.out.printf("Enter the address : ");
        addr=scan.nextLine();
        System.out.printf("Enter the phone no : ");
        phone=scan.next();
        System.out.printf("Enter the age : ");
        age=scan.nextInt();
        System.out.printf("Enter the salary : ");
        salary=scan.nextInt();       
    }
    
    void details()
    {
        System.out.println(name+" "+addr+" "+phone+" "+age);
    }    
}

class Officer extends Employee
{
   public String specialization;
}

class Manager extends Employee
{
    public String dept;
}
