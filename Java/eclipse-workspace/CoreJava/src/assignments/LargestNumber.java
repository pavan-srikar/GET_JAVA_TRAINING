package assignments;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :9:17:50 AM
 *project : projCoreJava
 */

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		int largest = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println("The largest number is " + largest);
		
		sc.close();

	}

}
