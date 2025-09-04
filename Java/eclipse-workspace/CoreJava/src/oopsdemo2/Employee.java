package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :4:18:59 PM
 *project : projCoreJava
 */

public class Employee {
	//Single Inheritance Example


	private int empId;
	private String name;

	//Generate Constructor using fiels
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}


	void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}

}
