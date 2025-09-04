package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :10:48:04 AM
 *project : projCoreJava
 */

public class Customer {
	//Hierarchical Inheritance Demo

	private String name;
	    private String email;
	    
	    
	    
	    
	     public Customer(String name, String email) {
			this.name = name;
			this.email = email;
		}




		 public void display(){
	        System.out.println("********** Customer Details ************");
	        System.out.println("Customer Name    : "+name);
	        System.out.println("Email            : "+email);
	    }

}
