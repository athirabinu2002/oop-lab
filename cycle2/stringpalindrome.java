import java.util.*;
class stringpalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,flag=0;
		System.out.println("Enter length of a string");
		int n=sc.nextInt();
		System.out.println("Enter a string");
		char s[]=new char[50];
		for(i=0;i<n;i++)
			s[i]=sc.next().charAt(0);
		for(i=0;i<n/2;i++,n--)
			if(s[i]==s[n-1])
			{
				flag=1;
				break;
			}
		if(flag==1)
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not palindrome");
	}
}
