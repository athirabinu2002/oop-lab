//Program to create a student class with name, roll no and marks of five subjects. Write functions to read and display the details.
import java.util.*;

 class grades
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String n = in.nextLine();
        System.out.print("Enter class of student: ");
        int c = in.nextInt();
        System.out.print("Enter roll no of student: ");
        int r = in.nextInt();
        System.out.print("Enter marks in 1st subject: ");
        int m1 = in.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = in.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = in.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = in.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = in.nextInt();
        int t = m1 + m2 + m3 + m4 + m5;
        double p = t / 500.0 * 100.0;
        String g;
        if (p >= 90)
            g = "A+";
        else if (p >= 80)
            g = "A";
        else if (p >=70)
            g = "B+";
        else if (p >= 60)
            g = "B";
        else if (p >= 50)
            g = "C";
        else if (p >= 40)
            g = "D";
        else
            g = "E";

        System.out.println("Total Marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);
    }
} 
