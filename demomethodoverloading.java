package week9;
class student 
{
	String name;
	float[] cie= {0,0,0};
	float avg;
	byte rollno;
	void setstudent(String n,float ia[],byte rno)
	{
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollno=rno;
		for(byte i=0;i<3;i++)
		{
			cie[i]=ia[i];
			sum=sum+cie[i];
		}
		avg=sum/3.0f;
	}
	void setstudent(String n,float ia1,float ia2,byte rno)
	{
		name=n;
		rollno=rno;
		cie[0]=ia1;
		cie[1]=ia2;
		avg=(cie[0]+cie[1])/3.0f;
	}
	void setstudent(String n,float ia,byte rno)
	{
		name=n;
		rollno=rno;
		cie[0]=ia;
		avg=(cie[0])/3.0f;
	}
	void showstudent() 
	{
		System.out.println(rollno+"\t\t"+name+"\t\t"+avg);
	}
}
public class demomethodoverloading 
{
	public static void main(String[]args)
	{
		student deeps=new student();
		System.out.println("the internal details of astudent");
		System.out.println("rollno\t\tname\t\tavgerage");
		deeps.setstudent("keerthy",19.4f,(byte)12);
		deeps.showstudent();
		deeps.setstudent("vijay",19.4f,17.6f,(byte)10);
		deeps.showstudent();
		float[] cie= {17.0f,12.6f,19.2f};
		deeps.setstudent("joe",cie,(byte)8);
		deeps.showstudent();
	}

}
