package javaprogram;
class mobilestore 
{
	String make;
	String model;
	String category;
	double price;
	double discount;
	double netprice;
	
	mobilestore()
	{
	  this.make="samsung";
	  this.model="galaxys21";
	  this.category="smartphone";
	  this.price=80099.99;
	  this.discount=0.15;
	}
	
	mobilestore(String make,String model,String category,double price,double discount)
	{
		this.make=make;
		this.model=model;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}
	mobilestore(mobilestore obj,mobilestore obj1,mobilestore obj2)
	{
		make=obj.make;
		model=obj1.model;
		category=obj2.category;
		price=obj.price;
		discount=obj2.discount;
	}
	
	boolean getDetails()
	{
		System.out.println("***");
		System.out.println("companyname:"+make);
		System.out.println("model:"+model);
		System.out.println("category:"+category);
		System.out.println("price:"+price);
		System.out.println("discount:"+discount);
		System.out.println("net price:"+calculateNetprice());
		System.out.println("****");
		return true;
	}
	double calculateNetprice()
	{
		netprice=price-(price*discount);
		return netprice;
	}	
}

class mobile
{
	public static void main(String[] args)
	{
	  mobilestore mobile1=new mobilestore();
		mobile1.getDetails();
		
	  mobilestore iphone=new mobilestore("apple","iphone12","smartphone",99999.99,0.1);
		iphone.getDetails();
		
	  mobilestore samsung=new mobilestore("samsung","galaxys21","smartphone",88899.99,0.15);
		samsung.getDetails();
		
	  mobilestore google=new mobilestore("google","pixel 5","smartphone",69999.99,0.2);
		google.getDetails();
		
	  mobilestore mobile2=new mobilestore(iphone,samsung,google);
		mobile2.getDetails();
	}
}
