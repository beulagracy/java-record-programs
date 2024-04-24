package week11;
import java.lang.*;
class numberrangeexception extends exception
{
	String message;
	numberrangeexception(String msg)
	{
		this.message=msg;
	}
	public String getmessage()
	{
		return message;
	}
}
public class Exceptiondemo 
{
	public static void main (String args[])
	{
		int number=25;
		try
		{
			if(number<10 || number>20)
			{
				throw new numberrangeexception("number not within specified range");
			}
			System.out.println("the number in range is:"+number);
		}
		catch (file not found exception nfe)
		{
			System.out.println("invalid filename \n file does not exists");
		}
	}
}
