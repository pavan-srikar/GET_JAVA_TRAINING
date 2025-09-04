package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :4:42:40 PM
 *project : projCoreJava
 */

public class Passenger {
	// Single Inheritance example in Java for an Airline Booking System



	private String name;
	private int age;
	private String passportNumber;


	//genearete constructor
	public Passenger(String name, int age, String passportNumber) {
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}


	public void displayPassengerDetails() {
		System.out.println("----- Passenger Details -----");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Passport Number: " + passportNumber);
	}



}
