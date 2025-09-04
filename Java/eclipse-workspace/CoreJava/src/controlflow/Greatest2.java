package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :9:38:18 AM
 *project : projCoreJava
 */

public class Greatest2 {

	public static void main(String[] args) {

		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if (a>b) {
			System.out.println(a+" is the greatest");
			
		} else {
			System.out.println(b+" is the greatest");

		}
		sc.close();

	}

}
