package javaprogram;
import java.util.Scanner;
public class checkpalindrome
{
	public static void main(String[] args)
	{
		String str_original=" ",reverseStr=" ";
		Scanner inscanner=new Scanner(System.in);
		System.out.println("enter any valid string...");
		str_original=inscanner.next();
		inscanner.close();
		int str_length=str_original.length();
		System.out.println("length is..."+str_length);
		for(int i=(str_length-1);i>=0;--i)
		{
			reverseStr=reverseStr+str_original.charAt(i);
		}
		if(str_original.equalsIgnoreCase(reverseStr))
		{
			System.out.println("the given string \" "+str_original+"\" is a palindrome ");		
		}
		else 
		{
			System.out.println("the given string \" "+str_original+"\" is not a palindrome ");	
		}
		
	}

}
