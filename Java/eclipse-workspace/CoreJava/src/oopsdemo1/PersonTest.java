package oopsdemo1;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :2:22:27 PM
 *project : projCoreJava
 */

public class PersonTest {

	public static void main(String[] args) {
		
		Person objPerson1=new Person();
		
		objPerson1.input();
		objPerson1.print();
		
		System.out.println("*****************************");
		Person objPerson2=new Person("Mike",45);
		
		objPerson2.print();
		
		System.out.println("*****************************");
		Person objPerson3=new Person("mingo","Delhi",67);
		
		objPerson3.print();
		
		System.out.println("------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enetrr name,constitueisdcvds and age");
		String name=sc.next();
		String c=sc.next();
		int a = sc.nextInt();
		
		Person objPerson4 = new Person(name, c, a);
		objPerson4.print();
	}

}
