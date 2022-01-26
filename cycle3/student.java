import java.util.*;

class student
{
    int c,r,m1,m2,m3,m4,m5;
    String n;
    public static void main(String args[]) {
       student obj =  new student();
       obj.read();
       obj.display();
    }


    void read() {
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        n = ob1.nextLine();
        System.out.print("Enter class of student: ");
        c = ob1.nextInt();
        System.out.print("Enter roll no of student: ");
        r = ob1.nextInt();
        System.out.print("Enter marks in 1st subject: ");
        m1 = ob1.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        m2 = ob1.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        m3 = ob1.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        m4 = ob1.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        m5 = ob1.nextInt();
        ob1.close();
    }
            
    void display() {
        System.out.println("\nDisplaying the student details\n");
        System.out.println("Name of the Student is " + n);
        System.out.println("Class of the student is "+ c);
        System.out.println("Roll no of the Student is " + r);
        System.out.println("Marks on 1st subject is  " + m1);
        System.out.println("Marks on 2nd subject is  " + m2);
        System.out.println("Marks on 3rd subject is  " + m3);
        System.out.println("Marks on 4th subject is  " + m4);
        System.out.println("Marks on 5th subject is  " + m5);
        
    }
    
}
