package javaprogram;
import java.util.Scanner;
public class demoarraysort 
{
	public static void main(String args[])
	{
		int array[]=new int[10];
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter array size");
		int size =inScanner.nextInt();
		System.out.println("enter array elements one by one");
		for(int i=0;i<size;i++)
			array[i]=inScanner.nextInt();
		System.out.println("array elements before sorting are....");
		for(int i=0;i<size;i++)
			System.out.println(array[i]+"\t");
		System.out.println();
		inScanner.close();
		for(int i=0;i<size;i++)
		{
			int minindex=i;
			for(int j=0;j<size;j++)
			{
				if(array[j]<array[minindex])
					minindex=j;
			}
			//swap(array[i]with minvalue)
			int temporary=array[i];
			array[i]=array[minindex];
			array[minindex]=temporary;
		}
		System.out.println("array elements after sorting are....");
		for(int i=0;i<size;i++)
			System.out.println(array[i]+"\t");
	}
}
