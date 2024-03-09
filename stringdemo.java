package javaprogram;
import java.lang.String;
import java.lang.StringBuffer;
public class stringdemo 
{
	public static void main(String args[])
	{
		System.out.println("this code illustrates use of string class and its methods");
		System.out.println("***********************************************************");
		String str=new String("Train your mind to see good in everything");
		System.out.println("the initial string is :\t"+str);
		System.out.println("after replacing 'o' with 'O':\t"+str.replace('o','O'));
		System.out.println("the length of given string is :\t"+str.length());
		System.out.println("the occurence of character G is at position:\t"+str.indexOf('G'));
		System.out.println("the lower case of string is:\t"+ str.toLowerCase());
		System.out.println("the upper case of string is:\t"+str.toUpperCase());
		System.out.println("the extracted substring is:\t"+str.substring(27));
		String s="   hello world   ";
		System.out.println("the string with spaces:"+s);
		System.out.println("the string with leading & trailing spaces:\t"+s);
		System.out.println("the string without spaces:"+s.trim());
		if(s.isEmpty())
			System.out.println("string is empty");
		else
			System.out.println("the string is not empty it contains"+s);
		s=null;
		System.out.println("the string after modifying...\t"+s);
		System.out.println("***********************************");
		System.out.println("this code illustrates use of stringbuffer class and its methods");
		System.out.println("**********************************************************************");
	    StringBuffer strbuf=new StringBuffer();
	    System.out.println("the initial capacity of stringbuffer is"+strbuf.capacity());
	    strbuf.append("hello");
	    System.out.println("the stringbuffer is:\t"+strbuf);
	    strbuf.setLength(20);
	    strbuf.insert(5,"welcome to the world of java");
	    System.out.println("the stringbuffer is:\t"+strbuf);
	    System.out.println("the capacity of stringbuffer after appending"+strbuf.capacity());
	    System.out.println("the reverse of given stringbuffer is:\n"+strbuf.reverse());
	    System.out.println("the stringbuffer after deleting \t"+strbuf.delete(5,43));
	    System.out.println("*******************************************************************");
	}

}
