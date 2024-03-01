package javaprogram;
import java.util.Scanner;
public class duplicateelements 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[]array=new int[size];
		System.out.println("enter the elements of array:");
		for(int i=0;i<size;i++) 
		{
			array[i]=sc.nextInt();		
		}
		System.out.println("Does the array contain any duplicate elements?"+hasDuplicates(array));
	}
	 
	public static boolean hasDuplicates(int[]array) 
	{
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					return true;
				}
			}
		}
	return false;
    }
}
