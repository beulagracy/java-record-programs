package javaprogram;

import java.util.Scanner;

public class autoboxandunbox
{
	public static void main(String[] args)
	{
		float average=0.0f;
		Scanner sc=new Scanner(System.in);
		
		Integer cie1,cie2,cie3;
		System.out.println("enter the score of first internal:");
		cie1=Integer.parseInt(sc.next());
		System.out.println("enter the score of second internal:");
		cie2=Integer.parseInt(sc.next());
		System.out.println("enter the score of third internal:");
		cie3=Integer.parseInt(sc.next());
		 
		average=(float)(cie1+cie2+cie3)/3;
		System.out.println("the average internal score is"+average);
		sc.close();
	}
}