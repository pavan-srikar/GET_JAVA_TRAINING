package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :4:32:14 PM
 *project : projCoreJava
 */

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		//Create Objects of Child Class
		Developer d1=new Developer(101, "James", "JDBC", "SOME BANK");   //Invoked derived class constructor
		Developer d2=new Developer(10, "GGADh", "SQL", "SOME air lines");
		
		d1.display();	//child class object invokes parent class method - inheritance
		d1.displayDeveloperDetails(); //child class invoking child class method
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106, "sigma");
		e1.display();

	}

}
