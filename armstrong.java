package javaprogram;
import java.util.*;
public class armstrong 
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=SC.nextInt();
		int sum=0;
		int num=n;
		int rem=0;
		do 
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		while(num>10);
		{
		if(sum==n)
		{
		System.out.println("number is armstrong number");
		}
		else
		{
		System.out.println("number is not a armstrong number");
		}
		}
	}
}
