import java.util.*;
public class freqrev{   
	public static void main(String args[])
	{
        function obj=new function();
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj1.nextLine();
        System.out.println("Enter the character to be find the frequency: ");
        char a = obj1.next().charAt(0);
        obj1.close();
        obj.freq(str,a);
        obj.rev(str);
        
    }
}
class function
{
    void rev(String str)
    {
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string is:"+rev);
    }
    void freq(String str,char a)
    {
        int len=str.length();
        int frequency=0;
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i)){
                System.out.println("The character is present at position "+(i+1));
                frequency++ ;   } 
        }
        System.out.println("Frequency of character is "+frequency) ;
    }
}
