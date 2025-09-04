package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :11:49:43 AM
 *project : projCoreJava
 */

public class Student {
	int rollNo;
	String name;
	
	Address ad; //Entity Referrence = Aggregation - has a relationship
  
  
  
  public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad=ad;
	}



  void display()
	{
		System.out.println("---------- Student Details ------------");
		System.out.println("Student Id   :"+rollNo );
		System.out.println("Student Name :"+name);
		
		System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+
		ad.pincode);
	}
}
