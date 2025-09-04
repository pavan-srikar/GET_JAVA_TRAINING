package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :2:19:40 PM
 *project : projCoreJava
 *
 *Program to enter a Positive Number & display it
 */

public class DoWhileDemo {

	public static void main(String[] args) {
		int number;
		Scanner scanner=new Scanner(System.in);

		do{
			System.out.println("Enter a Number : ");
			number=scanner.nextInt();
			System.out.println(number);
		}while(number>0);

		System.out.println("The Entered Number is : "+number);

	}

}
