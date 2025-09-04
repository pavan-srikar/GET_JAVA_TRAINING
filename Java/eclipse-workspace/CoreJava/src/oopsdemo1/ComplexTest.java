package oopsdemo1;

import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1=new Complex(10.3, 67.4);
		Complex c2=new Complex(0.7, 3.6);
		Complex c3=new Complex(1.0, 1.0);
		
		c1.add(c2); //calls method add() by passing object c2
		System.out.println("The addition of 2 complex numbers is");
		c1.display();
		
		c1.add(c3);
		System.out.println("The addition of 2 complex numbers is");
		c1.display();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter real and immaginary part of complex numbers");
		double r=sc.nextDouble();
		double i=sc.nextDouble();
		
		Complex c4=new Complex(r, i);
		
		c2.add(c4); //c2+c4
		System.out.println("The addition of 2 complex numbers is");
		c2.display();
		

	}

}
