package javaprogram;
import java.util.Scanner;
public class diagnolmatrix 
{
	public static void main(String[] args)
	{
		int matrix[][]=new int[3][3];
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter matrix element one by one");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=inScanner.nextInt();	
	        }
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.print(matrix[i][j]+" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\t");
		 }
		  inScanner.close();	
	}
}
