package week12;
enum signal
{
	Red,yellow,green
}
class checksignal
{
	signal currentsignal;
	public checksignal(signal cs)
	{
		this.currentsignal=cs;
	}
	public void makeride()
	{
		switch(currentsignal)
		{
		    case Red:
			System.out.println("the signal is red \n kindly wait until it turns into green");
			break;
		    case yellow:
			System.out.println("the signal is yellow\n kindly wait look around and make safe move");
			break;
		    case green:
			System.out.println("the signal is green \n have a safe ride");
			break;
		}
	}	
}
public class Demoandnum 
{
	public static void main(String[]args)
	{
		checksignal mydrive=new checksignal(signal.green);
		mydrive.makeride();
	}
}
