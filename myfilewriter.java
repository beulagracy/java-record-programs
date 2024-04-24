package week11;
import java.io.scanner;
import java.io.*;
public class Myfilewriter 
{
	public static void main (String args[]) throws io exception
	{
		try
		{
			FileWriter fw=new filewriter("testfile.txt");
			String s="\n all the best for exams dear students\n";
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
				fw.write(ch[i]);
			s="good luck and prepare well";
			fw.write(s);
			fw.close();
			int i=0;
			filereader fi=new filereader("testfile1.txt");
			while((i=fr.read())!=-1)
				System.out.print((char)i);
			fr.close();	
		}
		catch (file not found exception nfe)
		{
			System.out.println("invalid filename \n file does not exists");
		}
	}
}
