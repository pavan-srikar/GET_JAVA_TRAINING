package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :10:04:47 AM
 *project : projCoreJava
 *
 *program to check weather the entered number is odd or even
 */

public class OddEven {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		num=sc.nextInt();

		if (num % 2 ==0) {
			System.out.println(num+" is an even number");
			
		} else {
			System.out.println(num +" is an Odd number");
		}
		sc.close();

	}

}
