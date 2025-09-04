package oopsdemo1;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :12:24:26 PM
 *project : projCoreJava
 */

public class Complex {
	//Program to add 2 complex numbers- Real & Imaginary part


	private double real;
	private double imaginary;

	// Generate Constructor using fields
	public Complex(double real, double imaginary) { //parameterized constructor
		this.real = real;
		this.imaginary = imaginary;
	}

	public void add(Complex obj) { //method which accepts objects as an argument
		//c1.real+=c2.real
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}

	public void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

	
}
