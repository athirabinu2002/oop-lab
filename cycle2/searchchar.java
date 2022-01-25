import java.util.*;
class searchchar
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the string");
		int n=sc.nextInt();
		char s[]=new char[50];
		System.out.println("Enter a string");
		for(i=0;i<n;i++)
			s[i]=sc.next().charAt(0);
		System.out.println("Enter the character to be searched");
		char ch=sc.next().charAt(0);
		for(i=0;i<n;i++)
			if(s[i]==ch)
				System.out.println("Character is found at the position "+(i+1));
	}
}
