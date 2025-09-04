package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :10:10:19 AM
 *project : projCoreJava
 *
 *Program to check weather entered number is single digit or not
 */

public class SingleDigit {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");
		num=sc.nextInt();

		if (num> -10 && num < 10) {
			System.out.println(num+" is single digit number");

		} else {
			System.out.println(num +" is not a single digit number");
		}
		sc.close();

	}

}
