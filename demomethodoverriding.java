package week9;
import java.util.Scanner;
class student 
{
	String name;
	float[] cie= {0,0,0};
	float avg;
	byte rollno;
	void setstudent(String n,float ia[],byte rno)
	{
		name=n;
		avg=0.0f;
		rollno=rno;
		for(byte i=0;i<3;i++)
		{
			cie[i]=ia[i];
		this.calculateaverage();
	}
}
void calculateaverage()
{
	float sum=0.0f;
	for(byte i=0;i<3;i++)
	{
		sum=sum+cie[i];
	avg=sum/3.0f;
    }
}
void showstudent()
{
	System.out.println(rollno+"\t\t"+name+"\t\t"+avg);
}
class Grade extends student
{
	final byte grace=10;
	float attendance;
	Scanner sc=new Scanner(System.in);
	
	void setstudent(String n,float ia[],byte rno)
	{
		System.out.println("enter the attendance of the student");
		attendance=sc.nextFloat();
		if (attendance>=75.0f)
		{
			ia[2]=grace;
			super.setstudent(n, ia, rno);
		}
		else {
			super.setstudent(n, ia, rno);
		}
	}
}
public class demomethodoverriding 
{
	public static void main(String[]args)
	{
		Grade deeps=new Grade();
		float[] cie= {18.4f,23.7f,7f,0};
		deeps.setstudent("keerthy",cie,(byte)15);
		System.out.println("the internal details of astudent");
		System.out.println("rollno\t\tname\t\tavgerage");
		deeps.showstudent();
	}
}

}
