import java.util.*;
class stringreplace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter length of the string");
		int n=sc.nextInt();
		char s[]=new char[50];
		System.out.println("Enter  a string");
		for(i=0;i<n;i++)
			s[i]=sc.next().charAt(0);
		System.out.println("Enter the location of the character to be replaced");
		int x=sc.nextInt();
		System.out.println("Enter the character which is to be replaced");
		char ch=sc.next().charAt(0);
		s[x-1]=ch;
		System.out.println("New string is");
		for(i=0;i<n;i++)
			System.out.println(s[i]);
	}
}
