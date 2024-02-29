package javaprogram;
class employee1
{
	String empName;
	int empNo;
	String empDesig;
	byte expyrs;
	double basicSalary;
	double netSalary;
	double grossSalary;
	double learnessAllowance;
	double HKA;
	double PA;
	double IT;
	employee1()
	{
		empName=null;
		empNo=0;
		empDesig=null;
		expyrs=0;
		basicSalary=0.0d;
	}
	 employee1(String name,int no,String des,byte ex,double basicSalary)
	 {
		empName=name;
		empNo=no;
		empDesig=des;
		expyrs=ex;
		basicSalary=basicSalary;
	 }
	 employee1(employee1 obj1,employee1 obj2)
	 {
		empName=obj1.empName;
		empNo= obj2.empNo;
		empDesig= obj1.empDesig;
		expyrs= obj2.expyrs;
		basicSalary= obj2.basicSalary;
	 }
	 void getemployee()
	 {
		learnessAllowance=basicSalary*0.40;
		HKA=basicSalary*0.25;
		PA=basicSalary*1.0;
		grossSalary=basicSalary+learnessAllowance+HKA+PA;
		IT=basicSalary*1.0;
		netSalary=grossSalary-IT;
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t\t"+expyrs+"\t\t"+basicSalary+"\t\t"+grossSalary+"\t\t"+netSalary);
	 }
	  public static void main(String[] args) 
     {
		  System.out.println("empName\tempNo\tempDesig\texpyrs\tbasicSalary\tgrosssalary\tnetSalary");
		  employee1 rakesh=new employee1();
		  rakesh.getemployee();
		  
		employee1 rahul=new employee1("rahul",100,"pm",(byte)10,10000.0d);
		rahul.getemployee();
		employee1 ramya =new employee1(rakesh,rahul);
		ramya.getemployee();
     }
  }
