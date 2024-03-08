package javaprogram;
public class vowelcount
{
	static void countcharactertype(String str)
	{
		byte vowelscount=0,consonantcount=0,digitcount=0,splchars=0;
		for(short i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowelscount++;
				else
					consonantcount++;
			}
			else if(ch>='0' && ch<='9')
				digitcount++;
			else
				splchars++;
		}
		System.out.println("the total number of vowels in the string:"+vowelscount);
		System.out.println("the total number of consonants in the string:"+consonantcount);
		System.out.println("the total number of digits in the string:"+digitcount);
		System.out.println("the total number of string in the string:"+splchars);
	}
	static public void main(String[] args)
	{
		String str=("habit-2:Begin with an end in your mind.\n stephen R.covey author of 7 habits of effective people,suggest that effective individual have a clear vision of their desired destination before embarking on any endeavor.");
		countcharactertype(str);
	}
}
