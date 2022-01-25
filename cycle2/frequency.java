import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,x=0;
		System.out.println("Enter length of the string");
		int n=sc.nextInt();
		char s[]=new char[50];
		System.out.println("Enter the string");
		for(i=0;i<n;i++)
			s[i]=sc.next().charAt(0);
		System.out.println("Enter the character whose frequency is to be claculated");
		char ch=sc.next().charAt(0);
		for(i=0;i<n;i++)
			if(s[i]==ch)
				x++;
		System.out.println("Frequency of "+ch+" in the string is "+x);
	}
}
