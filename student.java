package javaprogram;
import java.io.*;
class student 
{
	String name, course; int rno;
    float ia1,ia2,ia3,avg;
    student(){
            try {
                    InputStreamReader isr = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(isr);
                    System.out.println("Enter the Roll no. of Student: ");
                    rno = Integer.parseInt(br.readLine());
                    System.out.println("Enter the name of Student: ");
                    name = br.readLine();
                    System.out.println("enter the course of student");
                    course = br.readLine();
                    System.out.println("Enter the CIE-1 score of Student");
                    ia1=Float.parseFloat(br.readLine());
                    System.out.println("enter the CIE-2 score of student");
                    ia2=Float.parseFloat(br.readLine());
                    System.out.println("enter the CIE-3 score of student");
                    ia3=Float.parseFloat(br.readLine());
                    avg=(ia1+ia2+ia3)/3;
            }
            catch(Exception e)
            {
                    System.out.println("runtime errors occurs while reading input...");
                    e.printStackTrace();
            }
    }
    void displayStudentDetails()
    {
            System.out.println(rno+"\t"+name+"\t"+course+"\t"+ia1+"\t"+ia2+"\t"+ia3+"\t"+avg);
    }
}
class arrayofstu_bufferreader{
    public static void main(String args[])
    {
            student list[]=new student[5];
            for(int i=0;i<list.length;i++)
                    list[i]=new student();
            System.out.println("\n***************");
            System.out.println("R.no\tname\tcourse\tcie-1\tcie-2\tcie-3\tavg");
            for(int i=0;i<3;i++)
                    list[i].displayStudentDetails();
            System.out.println("\n**************");
    }
}
